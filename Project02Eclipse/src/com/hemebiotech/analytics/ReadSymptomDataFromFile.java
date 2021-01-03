package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadSymptomDataFromFile implements ISymptomReader {

    /**
     * Read the symptoms.txt file with the ReadSymptomDataFromFile class
     *
     * @return ArrayList resultListDataFile
     * @version 1.0
     * @author Eric
     */

    @Override
    public ArrayList<String> readSymptoms() {

        ArrayList<String> resultListDataFile = new ArrayList<>();

        try {

            BufferedReader reader = new BufferedReader(new FileReader("symptoms.txt")); // TODO : rendre parametrable le nom du fichier d'entree.
            String line = reader.readLine();
            while (line != null) {
                resultListDataFile.add(line);
                line = reader.readLine();
            }

            reader.close(); // TODO : utiliser un try-with-resources

        } catch (IOException e) {
            e.printStackTrace();
        }

        return resultListDataFile;
    }

}
