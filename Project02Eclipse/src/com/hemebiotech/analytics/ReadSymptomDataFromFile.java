package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadSymptomDataFromFile implements ISymptomReader {

    /**
     *
     * Read the symptoms.txt file with the ReadSymptomDataFromFile class
     *
     * @return resultListDataFile
     * @version 1.0
     * @author Eric
     */

    @Override
    public ArrayList<String> readSymptoms() {

        ArrayList<String> resultListDataFile = new ArrayList<>();

        // file path
        String filepath = "symptoms.txt";

        try {

            BufferedReader reader = new BufferedReader(new FileReader(filepath));
            String line = reader.readLine();
            while (line != null) {
                resultListDataFile.add(line);
                line = reader.readLine();
            }

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return resultListDataFile;
    }

}
