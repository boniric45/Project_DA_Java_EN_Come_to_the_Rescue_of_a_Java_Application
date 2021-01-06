package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WriteSymptomDataFile implements ISymptomWrite {

    /**
     * Write the file specified in AnalysticsCounter
     *
     * @return file define Analytics
     * @version 1.0
     * @author Eric
     */

    @Override
    public void symptomWriteDataFile(HashMap<String, Integer> resultMapCount, String fileOut) {

        /* try-with-resources Auto Close*/
        try (FileWriter writer = new FileWriter(fileOut)) {

            for (Map.Entry<String, Integer> map : resultMapCount.entrySet()) {

                // recording the symptoms in the file specified in AnalysticsCounter from the Map
                writer.write(map.getKey() + " : " + map.getValue() + "\r\n");
            }

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}

