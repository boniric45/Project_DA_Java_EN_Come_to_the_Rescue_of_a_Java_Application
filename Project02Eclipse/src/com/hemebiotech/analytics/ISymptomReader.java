 /*
  * AnalyticsCounter class
  *
  * Description :
  *
  * Anything that will read symptom data from a source
  * The important part is, the return value from the operation, which is a list of strings,
  * that may contain many duplications
  * The implementation does not need to order the list
  *
  * Version : 1.0
  *
  * Date : 10/12/2020
  *
  * Copyright : Eric Boniface
  *
  */

 package com.hemebiotech.analytics;


 import java.util.ArrayList;

 public interface ISymptomReader {
     /**
      * Retrieving information from the ReadSymptomDataFromFile class
      * and return listrelease to the main class
      *
      * @version 1.0
      * @author Eric
      */


    void readSymptoms();

     void sortSymptoms();

     void writeSymptoms();

 }

