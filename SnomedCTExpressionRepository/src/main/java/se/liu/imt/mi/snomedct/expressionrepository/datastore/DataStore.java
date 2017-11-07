package se.liu.imt.mi.snomedct.expressionrepository.datastore;

import java.util.Date;
import java.util.Map;
import java.util.Set;

import se.liu.imt.mi.snomedct.expressionrepository.api.ExpressionAlreadyDefined;
import se.liu.imt.mi.snomedct.expressionrepository.api.ExpressionAlreadyExistsException;
import se.liu.imt.mi.snomedct.expressionrepository.api.NonExistingIdException;
import se.liu.imt.mi.snomedct.expressionrepository.datatypes.ConceptId;
import se.liu.imt.mi.snomedct.expressionrepository.datatypes.ConceptReplacement;
import se.liu.imt.mi.snomedct.expressionrepository.datatypes.Expression;
import se.liu.imt.mi.snomedct.expressionrepository.datatypes.ExpressionId;
import se.liu.imt.mi.snomedct.expressionrepository.datatypes.TargetComponentId;

/**
 * The interface to the data store.
 * 
 * @author Daniel Karlsson, daniel.karlsson@liu.se
 * @author Mikael Nystr�m, mikael.nystrom@liu.se
 * 
 */
public interface DataStore {

	/**
	 * Store an expression in the data store.
	 * 
	 * @param expression
	 *            The expression to store.
	 * @param time
	 *            The time the expression is stored. A <code>null</code> value is handled as the current time.
	 * @return The stored expression's id.
	 * @throws DataStoreException
	 *             Thrown if there are any problem with the data store.
	 * @throws ExpressionAlreadyExistsException
	 *             Thrown if the expression already exists in the data store.
	 */
	ExpressionId storeExpression(String expression, Date time)
			throws DataStoreException, ExpressionAlreadyExistsException;

	/**
	 * Store that an expression is equivalent to an existing expression in the data store.
	 * 
	 * @param id
	 *            The expression's id to store the equivalence for.
	 * @param equivalentExpressionId
	 *            The expression's or concept's id for the equivalent expression.
	 * @param time
	 *            The time the expression equivalence is stored. A <code>null</code> value is handled as the current
	 *            time.
	 * @throws DataStoreException
	 *             Thrown if there are any problem with the data store.
	 * @throws NonExistingIdException
	 *             Thrown if at least one of the expression ids don't exist in the data store.
	 * @throws ExpressionAlreadyDefined
	 *             Thrown if the definition already has been altered at a later point in time than the specified time in
	 *             the <code>time</code> parameter.
	 */
	void storeExpressionEquivalence(ExpressionId id, ExpressionId equivalentExpressionId, Date time)
			throws DataStoreException, NonExistingIdException, ExpressionAlreadyDefined;

	/**
	 * Store an expression's parent(s) and child(ren) in the data store. It is possible to only store parent(s) or only
	 * store child(ren) for an expression. Hoverer at least parent(s) or child(ren) must be stored.
	 * 
	 * @param id
	 *            The expression's id to store the parent(s) and child(ren) for.
	 * @param parents
	 *            The expression's parent(s). A <code>null</code> value is handled as no parents.
	 * @param children
	 *            The expression's child(ren). A <code>null</code> value is handled as no children.
	 * @param time
	 *            The time the expression's parent(s) and child(ren) were stored. A <code>null</code> value is handled
	 *            as the current time.
	 * @throws DataStoreException
	 *             Thrown if there are any problem with the data store.
	 * @throws NonExistingIdException
	 *             Thrown if at least one of the expression ids don't exist in the data store.
	 * @throws ExpressionAlreadyDefined
	 *             Thrown if the definition already has been altered at a later point in time than the specified time in
	 *             the <code>time</code> parameter.
	 */
	void storeExpressionParentsAndChildren(ExpressionId id, Set<ExpressionId> parents, Set<ExpressionId> children,
			Date time) throws DataStoreException, NonExistingIdException, ExpressionAlreadyDefined;

	/**
	 * Inactivate an expression's definition from the data store.
	 * 
	 * @param id
	 *            The expression's id to inactivate the definition for.
	 * @param time
	 *            The time the expression's definition was inactivated. A <code>null</code> value is handled as the
	 *            current time.
	 * @throws DataStoreException
	 *             Thrown if there are any problem with the data store.
	 * @throws NonExistingIdException
	 *             Thrown if the expression's id don't exist in the data store.
	 * @throws ExpressionAlreadyDefined
	 *             Thrown if the definition already has been altered at a later point in time than the specified time in
	 *             the <code>time</code> parameter.
	 */
	void inactivateExpressionDefinition(ExpressionId id, Date time)
			throws DataStoreException, NonExistingIdException, ExpressionAlreadyDefined;

	/**
	 * Get an expression's id from the data store.
	 * 
	 * @param expression
	 *            The expression to receive the id for.
	 * @param time
	 *            The specific time. A <code>null</code> value is handled as the current time.
	 * @return The expression's id. If the expression do not exist in the data store then <code>null</code> is returned.
	 * @throws DataStoreException
	 *             Thrown if there are any problem with the data store.
	 */
	ExpressionId getExpressionId(String expression, Date time) throws DataStoreException;

	/**
	 * Get a String representation of an expression from the data store given an expression id.
	 * 
	 * @param id
	 *            The expression id to receive the String representation for.
	 * @param time
	 *            The specific time. A <code>null</code> value is handled as the current time.
	 * @return The String representation of the expression.
	 * @throws DataStoreException
	 *             Thrown if there are any problem with the data store.
	 * @throws NonExistingIdException
	 *             Thrown if the expression id does not exist in the data store.
	 */
	String getExpression(ExpressionId id, Date time) throws DataStoreException, NonExistingIdException;

	/**
	 * Get all ancestors to an expression at a specific time.
	 * 
	 * @param id
	 *            The expression's id.
	 * @param time
	 *            The specific time. A <code>null</code> value is handled as the current time.
	 * @return The ancestors' ids.
	 * @throws DataStoreException
	 *             Thrown if there are any problem with the data store.
	 * @throws NonExistingIdException
	 *             Thrown if the expression id does not exist in the data store.
	 */
	Set<ExpressionId> getAncestors(ExpressionId id, Date time) throws DataStoreException, NonExistingIdException;

	/**
	 * Get all descendants to an expression at a specific time.
	 * 
	 * @param id
	 *            The expression's id.
	 * @param time
	 *            The specific time. A <code>null</code> value is handled as the current time.
	 * @return The descendants' ids.
	 * @throws DataStoreException
	 *             Thrown if there are any problem with the data store.
	 * @throws NonExistingIdException
	 *             Thrown if the expression id does not exist in the data store.
	 */
	Set<ExpressionId> getDescendants(ExpressionId id, Date time) throws DataStoreException, NonExistingIdException;

	/**
	 * Get all parents to an expression at a specific time.
	 * 
	 * @param id
	 *            The expression's id.
	 * @param time
	 *            The specific time. A <code>null</code> value is handled as the current time.
	 * @return The parents' ids.
	 * @throws DataStoreException
	 *             Thrown if there are any problem with the data store.
	 * @throws NonExistingIdException
	 *             Thrown if the expression id does not exist in the data store.
	 */
	Set<ExpressionId> getParents(ExpressionId id, Date time) throws DataStoreException, NonExistingIdException;

	/**
	 * Get all children to an expression at a specific time.
	 * 
	 * @param id
	 *            The expression's id.
	 * @param time
	 *            The specific time. A <code>null</code> value is handled as the current time.
	 * @return The children\s ids.
	 * @throws DataStoreException
	 *             Thrown if there are any problem with the data store.
	 * @throws NonExistingIdException
	 *             Thrown if the expression id does not exist in the data store.
	 */
	Set<ExpressionId> getChildren(ExpressionId id, Date time) throws DataStoreException, NonExistingIdException;

	/**
	 * Get all expressions in the data store at a specific time.
	 * 
	 * @param time
	 *            The specific time. A <code>null</code> value is handled as the current time.
	 * @return All expressions in the data store.
	 * @throws DataStoreException
	 *             Thrown if there are any problem with the data store.
	 */
	Set<Expression> getAllExpressions(Date time) throws DataStoreException;

	/**
	 * Check if an id exist as an id for a concept or expression in the data store at a specific time.
	 * 
	 * @param id
	 *            The id to check the existence for.
	 * @param time
	 *            The specific time. A <code>null</code> value is handled as the current time.
	 * @return If the id exists or not in the data store.
	 * @throws DataStoreException
	 *             Thrown if there are any problem with the data store.
	 */
	boolean isExistingId(ExpressionId id, Date time) throws DataStoreException;

	/**
	 * Check if the concept or expression with id id1 is subsuming but not is equivalent to the concept or expression
	 * with id id2 at a specific time.
	 * 
	 * @param ancestorId
	 *            The id of the concept or expression that is potentially an ancestor.
	 * @param descendantId
	 *            The id of the concept or expression that is potentially a descendant.
	 * @param time
	 *            The specific time. A <code>null</code> value is handled as the current time.
	 * @return If the concept or expression with id1 is subsuming but not is equivalent to the concept or expression
	 *         with id2.
	 * @throws DataStoreException
	 *             Thrown if there are any problem with the data store.
	 * @throws NonExistingIdException
	 *             Thrown if the expression id does not exist in the data store.
	 */
	boolean isSubsumingNotEquivalent(ExpressionId ancestorId, ExpressionId descendantId, Date time)
			throws DataStoreException, NonExistingIdException;

	/**
	 * Check if one concept or expression is equivalent to another concept or expression at a specific time.
	 * 
	 * @param id1
	 *            The id of the first concept or expression.
	 * @param id2
	 *            The id of the second concept or expression.
	 * @param time
	 *            The specific time. A <code>null</code> value is handled as the current time.
	 * @return If the concept or expression with id1 is equivalent to the concept or expression with id2.
	 * @throws DataStoreException
	 *             Thrown if there are any problem with the data store.
	 * @throws NonExistingIdException
	 *             Thrown if the expression id does not exist in the data store.
	 */
	boolean isEquivalent(ExpressionId id1, ExpressionId id2, Date time)
			throws DataStoreException, NonExistingIdException;

	/**
	 * Check if one concept or expression is subsuming another concept or expression at a specific time.
	 * 
	 * @param ancestorId
	 *            The id of the concept or expression that is potentially an ancestor or equivalent.
	 * @param descendantId
	 *            The id of the concept or expression that is potentially a descendant or equivalent.
	 * @param time
	 *            The specific time. A <code>null</code> value is handled as the current time.
	 * @return If the concept or expression with id1 is subsuming the concept or expression with id2.
	 * @throws DataStoreException
	 *             Thrown if there are any problem with the data store.
	 * @throws NonExistingIdException
	 *             Thrown if the expression id does not exist in the data store.
	 */
	boolean isSubsuming(ExpressionId ancestorId, ExpressionId descendantId, Date time)
			throws DataStoreException, NonExistingIdException;
	
	
	
	
	
	
	
	
	
	
	
	
	/**AUTHOR-MEDHANIE WELDEMARIAM**/
	/**
	 * Get all concepts in the data store table concepts in which their endtime is equals to the release date and has no new version of it.
	 * 
	 * @param time
	 *            The expire date of the conceptId. A <code>null</code> value is handled as the current time.
	 * @return All inactivated concepts in the data store.
	 * @throws DataStoreException
	 *             Thrown if there are any problem with the data store.
	 */
	
	Set<ConceptId> getInactivatedConceptIdSet(String dateString) throws DataStoreException, NonExistingIdException;
	
	/**AUTHOR-MEDHANIE WELDEMARIAM**/
	/**
	 * Accept the list of ambiguous concept replacements chosen by the local repo administrator.
	 * 
	 * @conceptComponentMap-- HashMap consists of 
	 * 
	 * @param conceptId--inactive concept
	 *            
	 * @param targetComponentId-- replacement concept
	 * 
	 */
	void updateambigiousconceptexprepohistory(Map<Long, Long> conceptComponentMap) throws DataStoreException;
	
	/**AUTHOR-MEDHANIE WELDEMARIAM**/
	/**
	 * Get all expressions in the expressions table.
	 *  
	 * @return All expressions in the expressions data store.
	 * @throws DataStoreException
	 *             Thrown if there are any problem with the data store.
	 */
	Set<Expression> getAllExpressions() throws DataStoreException;
	
	/**AUTHOR-MEDHANIE WELDEMARIAM**/
	/**
	 * Get all inactive concepts and their equivalent replacements/target component from the data store.
	 *  
	 * @return All inactive concepts and their target components in the data store.
	 * @throws DataStoreException
	 *             Thrown if there are any problem with the data store.
	 */
	Set<ConceptReplacement> getConceptTarget(String dateStr) throws DataStoreException;
	
	
	/**AUTHOR-MEDHANIE WELDEMARIAM**/
	/*
	 * It receives all the updated expressions from updateAllExpressions() method in ExpressionRepositoryImpl.java and sends
	 * data into data store by creating new record of the same id 
	 * */
	void updateInactiveExpressions(Set<Expression> updatedExp, String dateTimeStr) throws DataStoreException;


	/**AUTHOR-MEDHANIE WELDEMARIAM**/
	/*
	 * It fills out the expression repository history table with sample data for testing purpose
	 * id, starttime,	endtime, moduleid, referencedcomponentid, valueid
	 */
	void fillSampleTestDataExpressionRepoTable(String starttime, String endtime, Long moduleid, Long referencedcomponentid, Long valueid) throws DataStoreException;
	
	/**AUTHOR-MEDHANIE WELDEMARIAM**/
	/*
	 * It retrives targetComponentId for a given referencedComponentId and Valueid, for testing purpose only
	 */
	TargetComponentId getTargetComponentIdTesting(Long referencedcomponentid, Long valueid) throws DataStoreException;
	
	
	
	/**AUTHOR-MEDHANIE WELDEMARIAM**/
	/*
	 * It deletes the expression that has been added for testing purpose
	 */
	void deleteSampleInsertedExpression(String expressionStr) throws DataStoreException;
	
	
	/**AUTHOR-MEDHANIE WELDEMARIAM**/
	/*
	 * It inserts new expression endtim!=infinity for testing purpose
	 */
	void insertSampleInactiveTestExpression(String startdate, String enddate, String expression) throws DataStoreException;
	
	/**AUTHOR-MEDHANIE WELDEMARIAM**/
	/*
	 * It inserts new expression endtim==infinity for testing purpose
	 */
	void insertSampleActiveTestExpression(String startdate, String expression) throws DataStoreException;
}