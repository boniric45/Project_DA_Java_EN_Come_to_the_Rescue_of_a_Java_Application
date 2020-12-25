package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadSymptomDataFromFile implements ISymptomReader {

    public String filepath = "symptoms.txt";       // file path

    /**
     * read the file and add the symptoms one per line to the result list
     *
     * @throws e
     * @author Eric
     */

    ArrayList<String> resultListDataFile = new ArrayList<>();

    public void getSymptoms() {

        if (filepath != null) {

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
        }
    }

    /**
     * Retrieving information from the ReadSymptomDataFromFile class
     * and return listrelease to the main class
     *
     * @version 1.0
     * @author Eric
     * @return
     */

    @Override
    public void readSymptoms() {
        getSymptoms();
        System.out.println("resultListDataFile > " + resultListDataFile);
     }

    @Override
    public void sortSymptoms() {
    }

    @Override
    public void writeSymptoms() {
    }
}
