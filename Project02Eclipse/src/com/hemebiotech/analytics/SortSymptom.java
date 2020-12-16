package com.hemebiotech.analytics;

import java.util.*;

public class SortSymptom implements ISymptomSort {

    /**
     * Sort sortSymptomList from readSymptoms() and listed in alphabetical order
     *
     * @return  ArrayList resultListDataFile
     * @version 1.0
     * @author Eric
     */

    public ArrayList<String> symptomSort(ArrayList <String> resultListDataFile) {

        //listed in alphabetical order
        Collections.sort(resultListDataFile);

        return resultListDataFile;
    }

}
