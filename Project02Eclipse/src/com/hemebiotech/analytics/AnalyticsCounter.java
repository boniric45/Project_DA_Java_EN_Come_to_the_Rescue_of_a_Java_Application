package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.HashMap;

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


        ArrayList<String> resultListDataFile = new ReadSymptomDataFromFile().readSymptoms("symptoms.txt"); // Read File symptoms.txt and return ArrayList

        resultListDataFile = new SortSymptom().symptomSort(resultListDataFile); // Read ArrayList resultListDataFile return ArrayList

        HashMap<String, Integer> map = new CountSymptom().symptomCount(resultListDataFile); // Read ArrayList return HashMap

        new WriteSymptomDataFile().symptomWriteDataFile(map, "result.out"); // Read Map and Write file result.out

    }

}

