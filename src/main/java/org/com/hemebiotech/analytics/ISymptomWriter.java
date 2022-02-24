package org.com.hemebiotech.analytics;
import java.io.IOException;
import java.util.Map;

public interface ISymptomWriter {
    /**
     *
     *  write the list of symptoms
     * @param file : list of symptoms with occurs
     */

    void writeSymptoms(Map<String, Integer> file) throws IOException, AnalyticsException;
}