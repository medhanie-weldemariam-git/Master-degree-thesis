DROP TABLE IF EXISTS concepts_rf2;
CREATE TABLE concepts_rf2
(
  id bigint NOT NULL,
  effectivetime date NOT NULL,
  active boolean NOT NULL,
  moduleid bigint NOT NULL,
  definitionstatusid bigint NOT NULL
)
WITH (
  OIDS=FALSE
);
ALTER TABLE concepts_rf2 OWNER TO postgres;
GRANT ALL ON TABLE concepts_rf2 TO postgres;
GRANT ALL ON TABLE concepts_rf2 TO exprepgroup;

DROP TABLE IF EXISTS relationships_rf2;
CREATE TABLE relationships_rf2
(
  id bigint NOT NULL,
  effectivetime date NOT NULL,
  active boolean NOT NULL,
  moduleid bigint NOT NULL,
  sourceid bigint NOT NULL,
  destinationid bigint NOT NULL,
  relationshipgroup integer NOT NULL,
  typeid bigint NOT NULL,
  characteristictypeid bigint NOT NULL,
  modifierid bigint NOT NULL
)
WITH (
  OIDS=FALSE
);
ALTER TABLE relationships_rf2 OWNER TO postgres;
GRANT ALL ON TABLE relationships_rf2 TO postgres;
GRANT ALL ON TABLE relationships_rf2 TO exprepgroup;











/******************AUTHOR MEDHANIE WELDEMARIAM***********/
DROP TABLE IF EXISTS associationReferenceSet_rf2;
CREATE TABLE associationReferenceSet_rf2
(
  id bigint NOT NULL,
  effectivetime date NOT NULL,
  active boolean NOT NULL,
  moduleid bigint NOT NULL,
  refsetId bigint NOT NULL,
  referencedComponentId bigint NOT NULL,
  targetComponentId bigint NOT NULL
)
WITH (
  OIDS=FALSE
);
ALTER TABLE associationReferenceSet_rf2 OWNER TO postgres;
GRANT ALL ON TABLE associationReferenceSet_rf2 TO postgres;
GRANT ALL ON TABLE associationReferenceSet_rf2 TO exprepgroup;




DROP TABLE IF EXISTS attributeValueReferenceSet_rf2;
CREATE TABLE attributeValueReferenceSet_rf2
(
  id varchar NOT NULL,
  effectivetime date NOT NULL,
  active boolean NOT NULL,
  moduleid bigint NOT NULL,
  refsetId bigint NOT NULL,
  referencedComponentId bigint NOT NULL,
  valueId bigint NOT NULL
)
WITH (
  OIDS=FALSE
);
ALTER TABLE attributeValueReferenceSet_rf2 OWNER TO postgres;
GRANT ALL ON TABLE attributeValueReferenceSet_rf2 TO postgres;
GRANT ALL ON TABLE attributeValueReferenceSet_rf2 TO exprepgroup;





DROP TABLE IF EXISTS expressionrephistory;
DROP SEQUENCE IF EXISTS expressionrephistoryid_seq;
CREATE SEQUENCE expressionrephistoryid_seq start 30000;
CREATE TABLE expressionrephistory
(
  id bigint DEFAULT nextval('expressionrephistoryid_seq') NOT NULL,
  starttime date ,
  endtime date,
  moduleid bigint,
  refsetId bigint,
  referencedComponentId bigint,
  targetComponentId bigint,
  valueId bigint
)
WITH (
  OIDS=FALSE
);
ALTER TABLE expressionrephistory OWNER TO postgres;
GRANT ALL ON TABLE expressionrephistory TO postgres;
GRANT ALL ON TABLE expressionrephistory TO exprepgroup;


/** Fill out id, starttime, endtime, moduleid and referencedcomponentid columns in expressionrephistory relation**/
INSERT INTO
    expressionrephistory
(   
	starttime,
	endtime,
    moduleid,
	referencedcomponentid
)
SELECT c.starttime, c.endtime, c.moduleid, c.id FROM concepts c
WHERE c.id IN 
(SELECT id FROM Concepts WHERE id IN 
	(SELECT id FROM Concepts GROUP BY id HAVING COUNT(*) = 1) 
	AND endtime='2016-01-31' ORDER BY id
);

/**Fill out valueid in expressionrephistory relation**/
UPDATE expressionrephistory e
SET valueid= at.valueid
FROM attributevaluereferenceset_rf2 at
WHERE e.referencedcomponentid= at.referencedcomponentid;

/**Fill out targetcomponentid in expressionrephistory relation for concepts which were inactivated because of duplication**/
UPDATE expressionrephistory e
SET targetcomponentid= a.targetcomponentid
FROM associationreferenceset_rf2 a
WHERE e.referencedcomponentid= a.referencedcomponentid AND e.valueid!=900000000000484002;


/** List all concepts which are inactive due to ambiguity in the terminal (For practice purpose)**/
SELECT a.referencedcomponentid, a.targetComponentId
FROM associationreferenceset_rf2 a, attributevaluereferenceset_rf2 at, expressionrephistory e
WHERE a.referencedComponentId=at.referencedComponentId 
AND e.referencedComponentId = at.referencedComponentId
AND at.valueid=900000000000484002; 


/** Generate the inactive ambigious concepts in a text file format and report them to the administrator**/ 
Copy (SELECT a.referencedcomponentid, a.targetComponentId
FROM associationreferenceset_rf2 a, attributevaluereferenceset_rf2 at,  expressionrephistory e
WHERE a.referencedComponentId = at.referencedComponentId 
AND e.referencedComponentId = at.referencedComponentId
AND at.valueid = 900000000000484002) 
To '/tmp/ambigous_concepts_replacement.csv' With CSV DELIMITER ' ';

