/*
 * AnalyticsCounter class
 * 
 * Description : 
 * 
 * Read the symptom.txt file and return the result to the ISymptomReader class
 * 
 * Version : 1.0 
 * 
 * Date : 10/12/2020
 * 
 * Copyright : Eric Boniface
 * 
 */

package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ReadSymptomDataFromFile implements ISymptomReader {
	
	private static String filepath="symptoms.txt";       // file path 

	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 * @version 1.0
	 * @author Eric
	 * 
	 */
	public ReadSymptomDataFromFile (String filepath) {
		
		this.filepath = filepath;
		
	}
	
	/**
	 * 
	 * read the file and add the symptoms one per line to the result list
	 * @return result
	 * @exception e
	 * @author Eric
	 * 
	 */
	public static List<String> GetSymptoms() {
		
		ArrayList<String> result = new ArrayList<String>();
		
			if (filepath != null) {
			
			try {
				
				BufferedReader reader = new BufferedReader (new FileReader(filepath));
				
				String line = reader.readLine();
				
				while (line != null) {
					
					result.add(line);
					line = reader.readLine();	
					
					}
				
				reader.close();
				
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		  	//System.out.println("Read > "+result);
		  	
	return result;

	}

}
