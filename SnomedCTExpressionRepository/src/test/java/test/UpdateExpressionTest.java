package test;

import java.util.Map;

import se.liu.imt.mi.snomedct.expressionrepository.ExpressionRepositoryImpl;
import se.liu.imt.mi.snomedct.expressionrepository.api.ExpressionRepository;
import se.liu.imt.mi.snomedct.expressionrepository.api.NonExistingIdException;
import se.liu.imt.mi.snomedct.expressionrepository.datastore.DataStoreException;
import se.liu.imt.mi.snomedct.expressionrepository.datastore.postgresql.DataStore;
import se.liu.imt.mi.snomedct.expressionrepository.util.UpdateExpressionUtil;

public class UpdateExpressionTest {

	public static void main(String[] args) throws DataStoreException 
	{
		try 
		{
			ExpressionRepository ex = new ExpressionRepositoryImpl();
			ex.updateAllExpressions();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		/*create object express.rep.impl
		 * call update all expressions*/
		/*final String AMBIGOUS_REPLACEMENT_MAPPING_FILE = "/tmp/ambigous_concepts_replacement.csv";
		DataStore ds;
		try 
		{
			ds = new DataStore("jdbc:postgresql://localhost:5432/postgres", "postgres", "thisshouldbeyourpassword");
			//ds.getInactivatedConceptIdSet();
			//testing the update functionality which updates the ambigous concepts 
			//reading the map of ambiguous concept and target comp id chosen by admin
			Map<Long, Long> conceptCompMap = UpdateExpressionUtil.readConceptsFromFile(AMBIGOUS_REPLACEMENT_MAPPING_FILE);
			//passing to function to update the expression rep history
			ds.updateambigiousconceptexprepohistory(conceptCompMap);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}*/
		
//		System.out.println("Testing the read concepts from file functionality...");
//		testReadConceptFromFile("/tmp/ambigous_concepts_replacement.csv");
	}
	
	public static void testReadConceptFromFile(String fileName)
	{
		UpdateExpressionUtil.readConceptsFromFile(fileName);
	}
	

}
