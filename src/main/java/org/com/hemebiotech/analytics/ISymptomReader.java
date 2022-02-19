package org.com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;

public interface ISymptomReader {
    List<String> GetSymptoms ();
    void WriteSymptoms (String file) throws IOException;
}
