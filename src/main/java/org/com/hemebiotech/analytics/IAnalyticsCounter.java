package org.com.hemebiotech.analytics;
import java.util.List;
import java.util.Map;

/**
 * finds the number of occurrences in the entire file
 *
 */
public interface IAnalyticsCounter {
    /**
     * @param listOfSymptoms : list of Symptoms
     * @return list of symptoms with number of occurrences
     *
     */

    Map<String, Integer> analyticsCount(List<String> listOfSymptoms) ;
}