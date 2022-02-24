package org.com.hemebiotech.analytics;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadSymptomDataFromFile implements ISymptomReader {
    private final String filepath;

    /**
     * @param filepath write the list of symptoms
     */
    public ReadSymptomDataFromFile(String filepath) {
        this.filepath = filepath;
    }

    @Override
    public List<String> getSymptoms() throws AnalyticsException {
        List<String> result = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filepath));
            String line = reader.readLine();
            while (line != null) {
                result.add(line);
                line = reader.readLine();
            }
            // close the file
            reader.close();
        } catch (IOException e) {
            throw new AnalyticsException("error to read input file" + filepath);
        }
        return result;
    }
}