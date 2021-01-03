package com.hemebiotech.analytics;

import java.util.ArrayList;

public class AnalyticsCounter {

    /**
     * Read the symptoms.txt file with the Read SymptomDataFromFile class
     * Sort with the SortSymptom class
     * Count with the CountSymptom class
     * Write the result.out file with the WriteSymptomDataFile class
     *
     * @return result.out
     * @version 1.0
     * @author Eric
     */

    public static void main(String[] args) {

        // TODO : optimiser le code en utilisant moins de variable.

        ArrayList<String> resultListDataFile = new ReadSymptomDataFromFile().readSymptoms(); // Read File symptoms.txt return ArrayList

        ArrayList<String> resultListSort = new SortSymptom().symptomSort(resultListDataFile); // Read ArrayList resultListDataFile return ArrayList resultListSort

        ArrayList<String> resultListCount = new CountSymptom().symptomCount(resultListSort); // Read ArrayList resultListSort return ArrayList resultListCount

        new WriteSymptomDataFile().symptomWriteDataFile(resultListCount); // Read ArrayList resultListCount and Write file result.out

    }

}

