package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteSymptomDataFile implements ISymptomWrite {

    /**
     * Write the result.out file
     *
     * @return result.out file
     * @version 1.0
     * @author Eric
     */

    @Override
    public void symptomWriteDataFile(ArrayList<String> resultListCount) { // TODO : rendre parametrable le nom du fichier de sortie.

        //	Creating and saving the result.out file
        FileWriter writer;

        try {

            writer = new FileWriter("result.out");

            for (String rowListRelease : resultListCount) {

                // display of the final list in console
                System.out.println(rowListRelease);

                // recording the symptoms in the result.out file from the list
                writer.write(rowListRelease + "\r\n");

            }

            writer.close(); // TODO : utiliser un try-with-resources

        } catch (IOException e) {

            e.printStackTrace();
            System.out.println("Error : " + e);
        }

    }

}

