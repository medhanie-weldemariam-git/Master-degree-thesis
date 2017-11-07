COPY concepts_rf2 FROM 
:f1
WITH DELIMITER AS E'\t' CSV HEADER QUOTE AS '|';

COPY relationships_rf2 FROM
:f2
WITH DELIMITER AS E'\t' CSV HEADER QUOTE AS '`';

VACUUM FULL ANALYZE;






/**AUTHOR MEDHANIE WELDEMARIAM**/

COPY associationReferenceSet_rf2 FROM '/home/medhanie/Documents/2nd_year_courses/My_thesis_work/SnomedCT_Release_files/SnomedCT_RF2Release_INT_20160131/Snapshot/Refset/Content/der2_cRefset_AssociationReferenceSnapshot_INT_20160131.txt' DELIMITER '~' CSV;*/
COPY attributevaluereferenceset_rf2 FROM '/home/medhanie/Documents/2nd_year_courses/My_thesis_work/SnomedCT_Release_files/SnomedCT_RF2Release_INT_20160131/Snapshot/Refset/Content/der2_cRefset_AttributeValueSnapshot_INT_20160131.txt' DELIMITER '~' CSV;*/



/*

COPY concepts_rf2 FROM 
E'C:\\Users\\Public\\Documents\\sct2_Concept_Full_INT_20160131.txt'
WITH DELIMITER AS E'\t' CSV HEADER QUOTE AS '|';

COPY relationships_rf2 FROM
E'C:\\Users\\Public\\Documents\\sct2_Relationship_Full_INT_20160131.txt'
WITH DELIMITER AS E'\t' CSV HEADER QUOTE AS '`';

VACUUM FULL ANALYZE;

 */
