package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadSymptomDataFromFile implements ISymptomReader {

    /**
     * reads the file specified in AnalyticsCounter
     *
     * @return ArrayList resultListDataFile
     * @version 1.0
     * @author Eric
     */

    @Override
    public ArrayList<String> readSymptoms(String filePath) {

        ArrayList<String> resultListDataFile = new ArrayList<>();

        /* try-with-resources Auto Close*/
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {

            String line = bufferedReader.readLine();
            while (line != null) {
                resultListDataFile.add(line);
                line = bufferedReader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return resultListDataFile;
    }

}
