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

public class AnalyticsCounter {

    public static void main(String args[]) throws Exception {
/*
        ReadSymptomDataFromFile.Getsymptoms(); //lance la lecture
        ISymptomReader.GetSymptoms();//lit la liste, la tri et la compte
        WriteSymptomDataFile.FileWriterResult(); //lit la liste et enregistre le fichier de sortie
*/
        //lit


        ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile();
        readSymptomDataFromFile.readSymptoms();

        //Tri
        SortSymptoms sortSymptoms = new SortSymptoms();
        sortSymptoms.sortSymptoms();

        //Write
      //  WriteSymptomDataFile writeSymptomDataFile = new WriteSymptomDataFile();
        //writeSymptomDataFile.writeSymptoms();

    }

}

