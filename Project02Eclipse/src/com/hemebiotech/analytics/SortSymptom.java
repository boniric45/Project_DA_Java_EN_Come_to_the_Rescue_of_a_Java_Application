package com.hemebiotech.analytics;

import java.util.*;

public class SortSymptom extends ReadSymptomDataFromFile implements ISymptomSort {

    /**
     * Sort sortSymptomList from readSymptoms() and listed in alphabetical order
     *
     * @return sortSymptomList
     * @version 1.0
     * @author Eric
     */

    public Collection<String> symptomSort() {

        //created a ArrayList with resultListDataFile from ReadSymptomDataFromFile class
        ArrayList<String> sortSymptomList = readSymptoms();

        //listed in alphabetical order
        Collections.sort(sortSymptomList);

        return sortSymptomList;
    }

}
