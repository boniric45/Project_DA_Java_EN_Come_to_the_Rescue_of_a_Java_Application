package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteSymptomDataFile  implements ISymptomReader {

    @Override
    public void readSymptoms() {
    }

    @Override
    public void sortSymptoms() {

    }

    @Override
    public void writeSymptoms() {

      //  sortData(readSymptomDataFromFile.resultListDataFile);
        SortSymptoms sortSymptoms = new SortSymptoms();
        sortSymptoms.sortSymptoms();
      //  FileWriterResult(ArrayList<String> symptomResult);
    }


    /**
     * Retrieving the list of the ISymptomReader class
     * Creating and saving the result.out file
     *
     * @version 1.0
     * @author Eric
     */


//    public void FileWriterResult (ArrayList<String> sortSymptoms) {
//
//        sortSymptoms = new ArrayList<String>();
//
//        //	Creating and saving the result.out file
//
//        FileWriter writer;
//
//        try {
//
//            writer = new FileWriter ("result.out");
//
//            for(String rowListRelease : listRelease ) {
//
//                /* display of the final list in console */
//             //   System.out.println(rowListRelease);
//
//                /* recording the symptoms in the result.out file from the list */
//                writer.write(rowListRelease+"\r\n");
//
//           }
//
//           // writer.close();
//
//        } catch (IOException e) {
//
//            e.printStackTrace();
//
//            //System.out.println("Error : " + e);
//       }
//    }


}

