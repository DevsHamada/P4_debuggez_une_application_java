package org.com.hemebiotech.analytics;

import java.io.*;
import java.util.List;

public class WriteSymptomToFile implements ISymptomWriter {
    private final String filepath ;


    /**
     *  @param filepath output file name
     *
     */
    public WriteSymptomToFile(String filepath)
    {
        this.filepath = filepath;
    }

    @Override
    public void WriteSymptoms(List<String> file) throws AnalyticsException {
        try
        {
            System.out.println(filepath  + "\n");
            System.out.println(file  + "\n");
            BufferedWriter writer = new BufferedWriter(new FileWriter(filepath,true));
            for (String s : file) writer.write(s  + "\n");
            writer.close();
        }
        catch (IOException e)
        {
            throw new AnalyticsException("write error in input file: " + filepath);
        }
    }
}