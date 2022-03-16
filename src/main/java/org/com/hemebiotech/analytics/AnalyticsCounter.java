package org.com.hemebiotech.analytics;

import java.util.*;

public class AnalyticsCounter implements IAnalyticsCounter {

    @Override
    public Map<String, Integer> analyticsCount(List<String> list) {
        Map<String, Integer> listSymptoms = new TreeMap<>();
        for (String symptoms : list) {
            int frequencies = Collections.frequency(list, symptoms);
            if (listSymptoms.containsKey(symptoms)) {
                listSymptoms.put(symptoms, frequencies);
            } else {
                listSymptoms.put(symptoms, 1);
            }
        }
        return listSymptoms;
    }
}