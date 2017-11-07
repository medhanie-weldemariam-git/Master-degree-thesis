/**
 * 
 */
package se.liu.imt.mi.snomedct.expressionrepository.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.StringTokenizer;

import se.liu.imt.mi.snomedct.expressionrepository.datatypes.ConceptId;

/**
 * @AUTHOR-MEDHANIE WELDEMARIAM
 *
 */
public class UpdateExpressionUtil 
{
	/***/
	Set<ConceptId> getInactivatedConcepts()
	{
		return null;
	}
	
	public static Map<Long, Long> readConceptsFromFile(String fileName)
	{
		BufferedReader br;
		Long conceptId; 
		Long targetComponentId;
		final String CHAR_SET = "US-ASCII";
		Map<Long, Long> conceptComponentMap  = new HashMap<Long, Long>();
		int i=0;
		try
		{
			
			String line;
			br = new BufferedReader(new FileReader(fileName));
			while((line = br.readLine())!= null)
			{
				if(line.startsWith("#"))
				{
					continue;
				}
				System.out.println(line);
				StringTokenizer tokenizer = new StringTokenizer(line);
				conceptId = new Long(tokenizer.nextToken());
				targetComponentId = new Long(tokenizer.nextToken());
				System.out.println(i++ +" " + conceptId +" : " + targetComponentId);
				conceptComponentMap.put(conceptId, targetComponentId);
			}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();		
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (NoSuchElementException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();	
		}
		
		return conceptComponentMap;
	}
	
}
