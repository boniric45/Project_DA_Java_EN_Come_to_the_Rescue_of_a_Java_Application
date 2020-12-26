package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteSymptomDataFile extends CountSymptom implements ISymptomWrite {

    /**
     * Write the result.out file
     *
     * @return result.out file
     * @version 1.0
     * @author Eric
     */

    @Override
    public void symptomWriteDataFile() {

        //created a ArrayList with symptomCount() from CountSymptom class
        ArrayList<String> sortSymptoms = symptomCount();

        //	Creating and saving the result.out file
        FileWriter writer;

        try {

            writer = new FileWriter("result.out");

            for (String rowListRelease : sortSymptoms) {

                // display of the final list in console
                System.out.println(rowListRelease);

                // recording the symptoms in the result.out file from the list
                writer.write(rowListRelease + "\r\n");

            }

            writer.close();

        } catch (IOException e) {

            e.printStackTrace();
            System.out.println("Error : " + e);
        }

    }

}

