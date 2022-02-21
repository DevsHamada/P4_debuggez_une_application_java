package org.com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnalyticsCounter implements IAnalyticsCounter {

    @Override
    public List<String> analyticsCount(List<String> list) {
        List<String> listSymptoms  = new ArrayList<>();
        String occurssymptoms;
        for(int i = 0 ; i < list.size(); i++)
        {
            int Frequencies = Collections.frequency(list,list.get(i));
            if (i+1 != list.size())
            {
                if (!(list.get(i).equals(list.get(i + 1)))) {
                    occurssymptoms = list.get(i)+ " = " + Frequencies;
                    listSymptoms.add(occurssymptoms);
                    //   System.out.println(occurssymptoms);
                }
            }
        }
        return listSymptoms;
    }
}