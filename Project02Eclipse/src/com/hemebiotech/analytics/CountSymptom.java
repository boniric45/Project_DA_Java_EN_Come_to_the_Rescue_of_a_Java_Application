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
    public ArrayList<String> symptomCount(ArrayList<String> resultListSort) { // TODO : methode va retourner une map

        //Create new Objet Collection countlist
        Collection<String> countList = new HashSet<>(resultListSort); // TODO : remove
        // TODO : Creation d'une map <String, Integer>

        for (String symptom : resultListSort) {

            // TODO : faire une condition si le symptom est present dans la map

                // TODO : cas ou le symptome est deja present - on augmente le compteur.

                // TODO : cas ou le symptome n'est pas present - on ajoute le symptome avec un compteur egal a 1

            // count the number of symptoms
            int symptomCount = Collections.frequency(resultListSort, symptom); // TODO : remove

            // adds the symptom with its number in the countList collection
            countList.add(symptom + " : " + symptomCount); // TODO : remove
            countList.remove(symptom); // TODO : remove

        }

        // ArrayList creation from Collection countList
        ArrayList<String> countSymptomList = new ArrayList<String>(countList); // TODO : remove

        //sort the list alphabetically
        Collections.sort(countSymptomList); // TODO : remove

        return countSymptomList;
    }
}
