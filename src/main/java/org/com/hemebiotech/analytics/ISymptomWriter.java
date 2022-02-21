package org.com.hemebiotech.analytics;
import java.io.IOException;
import java.util.List;

public interface ISymptomWriter {
    /**
     *
     *  write the list of symptoms
     */

    void WriteSymptoms (List<String> file) throws IOException, AnalyticsException;
}