package org.com.hemebiotech.analytics;
import java.util.List;

public interface ISymptomReader {
    /**
     *
     * @return retrieve the list of symptoms
     */
    List<String> getSymptoms() throws AnalyticsException;

}