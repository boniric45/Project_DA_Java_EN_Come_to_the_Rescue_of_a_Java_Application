package com.hemebiotech.analytics;

import java.util.*;

public class SortSymptoms implements ISymptomReader {

    @Override
    public void readSymptoms() {
    }

    @Override
    public void sortSymptoms() {
        ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile();
        readSymptomDataFromFile.readSymptoms();
        sortData(readSymptomDataFromFile.resultListDataFile);
     }

    @Override
    public void writeSymptoms() {

    }

    /* results of ReadSymptomDataFromFile */
    public void sortData (ArrayList<String> symptomResult) {

        //  System.out.println("Symptom entrée > "+symptomResult);

        /* Collection creation to avoid duplicates */
        Collection<String> resultList = new HashSet<String>();

        for (String symptom : symptomResult) {

            /* count the number of symptoms */
            int symptomCount = Collections.frequency(symptomResult, symptom);

            /* adds the symptom with its number in the resultList collection */
            resultList.add(symptom + " : " + symptomCount);
            System.out.println(" SymptomReader> "+resultList);
        }

        /* Creation of a List in order to be able to classify it in alphabetical order */
        ArrayList<String> listRelease = new ArrayList<String>(resultList);

        /* alphabetical order */
        Collections.sort(listRelease);
        System.out.println("Release > "+listRelease);
    }


    /**
     * Retrieving information from the ReadSymptomDataFromFile class
     * and return listrelease to the main class
     *
     * @version 1.0
     * @author Eric
     * @return
     */

}
