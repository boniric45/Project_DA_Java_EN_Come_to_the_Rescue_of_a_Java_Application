 /*
 * AnalyticsCounter class
 * 
 * Description : 
 * 
 * Anything that will read symptom data from a source
 * The important part is, the return value from the operation, which is a list of strings,
 * that may contain many duplications
 * The implementation does not need to order the list
 * 
 * Version : 1.0 
 * 
 * Date : 10/12/2020
 * 
 * Copyright : Eric Boniface
 * 
 */

package com.hemebiotech.analytics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;


public interface ISymptomReader {
	/**
	 * Retrieving information from the ReadSymptomDataFromFile class
	 * and return listrelease to the main class
	 * @version 1.0
	 * @author Eric
	 */

		
	public static List<String> GetSymptoms () throws IOException {

		/* results of ReadSymptomDataFromFile */
	ArrayList<String> symptomResult = (ArrayList<String>) ReadSymptomDataFromFile.GetSymptoms();

  	
		/* Collection creation to avoid duplicates */
	Collection<String> resultList = new HashSet<String>(); 

    for(String symptom : symptomResult){	
     
		
    	/* count the number of symptoms */
	int symptomCount = Collections.frequency(symptomResult, symptom); 
	
		/* adds the symptom with its number in the resultList collection */
	resultList.add(symptom + " : " + symptomCount);  
	//System.out.println(" SymptomReader> "+resultList);
	
     }
    	/* Creation of a List in order to be able to classify it in alphabetical order */
    ArrayList<String> listRelease = new ArrayList<String>(resultList); 
    
    	/* alphabetical order */
    Collections.sort(listRelease); 


 	return listRelease;
 	
	}
	
}

