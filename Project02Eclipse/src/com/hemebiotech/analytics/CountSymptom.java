package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class CountSymptom implements ISymptomCount {

    /**
     * Count sortSymptomList from symptomSort() and listed in alphabetical order
     *
     * @return ArrayList countSymptomList
     * @version 1.0
     * @author Eric
     */

    @Override
    public ArrayList<String> symptomCount(ArrayList<String> resultListSort) {

        //Create new Objet Collection countlist
        Collection<String> countList = new HashSet<>(resultListSort);

        for (String symptom : resultListSort) {

            // count the number of symptoms
            int symptomCount = Collections.frequency(resultListSort, symptom);

            // adds the symptom with its number in the countList collection
            countList.add(symptom + " : " + symptomCount);
            countList.remove(symptom);

        }

        // ArrayList creation from Collection countList
        ArrayList<String> countSymptomList = new ArrayList<String>(countList);

        //sort the list alphabetically
        Collections.sort(countSymptomList);

        return countSymptomList;
    }
}
