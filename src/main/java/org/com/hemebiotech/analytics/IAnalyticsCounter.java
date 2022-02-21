package org.com.hemebiotech.analytics;
import java.util.List;

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

    List<String> analyticsCount(List<String> listOfSymptoms) ;
}