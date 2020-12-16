package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.HashMap;

public interface ISymptomCount {

    HashMap<String, Integer> symptomCount(ArrayList<String> resultListSort);

}
