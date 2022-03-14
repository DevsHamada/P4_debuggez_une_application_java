package org.com.hemebiotech.analytics;

import java.util.*;

public class AnalyticsCounter implements IAnalyticsCounter {

    @Override
    public Map<String, Integer> analyticsCount(List<String> list) {
        Map<String, Integer> listSymptoms = new TreeMap<>();
        for (int i = 0; i < list.size(); i++) {
            int Frequencies = Collections.frequency(list, list.get(i));
            if (listSymptoms.containsKey(list.get(i))) {
                listSymptoms.put(list.get(i), Frequencies);
            } else {
                listSymptoms.put(list.get(i), 1);
            }
        }
        return listSymptoms;
    }
}