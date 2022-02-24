package org.com.hemebiotech.analytics;

import java.io.*;
import java.util.Map;

public class WriteSymptomToFile implements ISymptomWriter {
    private final String filepath;
    /**
     * @param filepath output file name
     */
    public WriteSymptomToFile(String filepath) {
        this.filepath = filepath;
    }

    @Override
    public void writeSymptoms(Map<String, Integer> file) throws AnalyticsException {
        try {
            System.out.println(file + "\n");
            BufferedWriter writer = new BufferedWriter(new FileWriter(filepath, true));
            for (Map.Entry<String, Integer> s : file.entrySet()) {
                writer.write(s.getKey() + " : " + s.getValue() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            throw new AnalyticsException("write error in input file: " + filepath);
        }
    }
}