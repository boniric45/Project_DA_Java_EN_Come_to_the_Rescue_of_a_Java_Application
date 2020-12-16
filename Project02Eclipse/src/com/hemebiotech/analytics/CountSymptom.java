package com.hemebiotech.analytics;

import java.util.*;

public class CountSymptom implements ISymptomCount {

    /**
     * Count sortSymptomList from symptomSort() and listed in alphabetical order
     *
     * @return ArrayList countSymptomList
     * @version 1.0
     * @author Eric
     */

    @Override
    public HashMap<String, Integer> symptomCount(ArrayList<String> resultListSort) {

        // Create map <String, Integer>
        HashMap<String, Integer> map = new LinkedHashMap<>();// LindedHashMap Keep the insertion order

        for (String symptom : resultListSort) {

            // if symptom is present
            if (map.containsKey(symptom)) {

                //if the symptom is already present - the counter is increased.
                map.put(symptom, map.get(symptom) + 1); // TODO : est-ce que cela fonctionne ? Personnellement, j'aurais plutôt utilise la methode "replace(K key, V value)". Es-tu sur qu'il n'y a pas de doublon et que la bonne valeur est presente dans le fichier out ?

            } else {
                //case where the symptom is not present - add the symptom with a counter equal to 1
                map.put(symptom, 1);
            }
        }

        return map;
    }
}
