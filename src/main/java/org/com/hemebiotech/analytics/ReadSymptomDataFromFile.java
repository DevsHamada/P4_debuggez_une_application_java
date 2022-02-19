package org.com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadSymptomDataFromFile implements ISymptomReader {
     String filepath ;
    public ReadSymptomDataFromFile(String file)
    {
        this.filepath = file;
    }
    @Override
    public List<String> GetSymptoms() {
        List<String> result = new ArrayList<>();
        String filepath = "symptoms.txt";
        try {
            BufferedReader reader = new BufferedReader (new FileReader(filepath));
            String line = reader.readLine();
            int i = 0;
            while (line != null) {
                result.add(line);
                line = reader.readLine();
                i++;
               // System.out.println( i + line );
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
