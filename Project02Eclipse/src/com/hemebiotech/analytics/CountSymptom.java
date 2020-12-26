package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class CountSymptom extends SortSymptom implements ISymptomCount {

    /**
     * Count sortSymptomList from symptomSort() and listed in alphabetical order
     *
     * @return countSymptomList
     * @version 1.0
     * @author Eric
     */

    @Override
    public ArrayList<String> symptomCount() {

        //created a ArrayList with symptomSort() from SortSymptom class
        Collection<String> symptomResult = symptomSort();

        //Create new Objet Collection countlist
        Collection<String> countList = new HashSet<String>(symptomSort());

        for (String symptom : symptomResult) {

            // count the number of symptoms
            int symptomCount = Collections.frequency(symptomResult, symptom);

            // adds the symptom with its number in the countList collection
            countList.add(symptom + " : " + symptomCount);
            countList.remove(symptom);

        }

        // ArrayList creation from Collection countList
        ArrayList<String> countSymptomList = new ArrayList<String>(countList);

        // Creation of a List in order to be able to classify it in alphabetical order
        Collections.sort(countSymptomList);

        return countSymptomList;
    }
}
