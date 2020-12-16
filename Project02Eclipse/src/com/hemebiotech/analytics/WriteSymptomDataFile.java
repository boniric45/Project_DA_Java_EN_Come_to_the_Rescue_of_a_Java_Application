package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteSymptomDataFile {
	
	
	/**
	 * Retrieving the list of the ISymptomReader class
	 * Creating and saving the result.out file
	 * 
	 * @version 1.0
	 * @author Eric
	 */
	
	static void FileWriterResult () {
		
		/* Retrieving the list of the ISymptomReader class */
		ArrayList<String> listRelease = (ArrayList<String>) ReadSymptomDataFromFile.GetSymptoms();
		
		try {
			
			listRelease = new ArrayList<String>(ISymptomReader.GetSymptoms());
			
		} catch (IOException e1) {
			
			e1.printStackTrace();
			
			System.out.println(e1);
		} 	
	      	 
	 		/*	Creating and saving the result.out file */
	 		FileWriter writer;
	 		
	 		try {
	 			
	 			writer = new FileWriter ("result.out");
	 			
				for(String rowListRelease : listRelease ) {    
					
				/* display of the final list in console */
				System.out.println(rowListRelease); 
				
				/* recording the symptoms in the result.out file from the list */
	 			writer.write(rowListRelease+"\r\n"); 
	 			
				}
				
	 			writer.close();
	 			
	 		} catch (IOException e) {
	 			
	 			e.printStackTrace();
	 			
	 			System.out.println("Error : " + e);
	 		}
	 }

}
