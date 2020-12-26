package com.hemebiotech.analytics;

public class AnalyticsCounter {

    /**
     * Read the symptoms.txt file with the Read Symptom Data FromFile class
     * Sort with the SortSymptom class
     * Count with the CountSymptom class
     * Write the result.out file with the WriteSymptomDataFile class
     *
     * @return result.out
     * @version 1.0
     * @author Eric
     */

    public static void main(String[] args) throws Exception {

        //Read Data File
        ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile();
        readSymptomDataFromFile.readSymptoms();

        //Sort Data File
        SortSymptom sortSymptoms = new SortSymptom();
        sortSymptoms.symptomSort();

        //Count Data File
        CountSymptom countSymptom = new CountSymptom();
        countSymptom.symptomCount();

        //Write Data File
        WriteSymptomDataFile writeSymptomDataFile = new WriteSymptomDataFile();
        writeSymptomDataFile.symptomWriteDataFile();

    }

}

