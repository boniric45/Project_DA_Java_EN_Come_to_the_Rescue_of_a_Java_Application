/*
 * AnalyticsCounter class
 * 
 * Description : 
 * 
 * Version : 1.0 
 * 
 * Date : 10/12/2020
 * 
 * Copyright : Eric Boniface
 * 
 */


package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class AnalyticsCounter {
	
	public static void main(String args[]) throws Exception {
		
	ReadSymptomDataFromFile.GetSymptoms(); //lance la lecture
	ISymptomReader.GetSymptoms();//lit la liste, la tri et la compte
	WriteSymptomDataFile.FileWriterResult(); //lit la liste et enregistre le fichier de sortie

		
	}
	
}

