package org.com.hemebiotech.main;


import org.com.hemebiotech.analytics.*;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws IOException, AnalyticsException {

        String fileInPut  = "symptoms.txt";
        String fileOutPut = "results_out.txt";

        ISymptomReader readSymptomFromFileIn = new ReadSymptomDataFromFile(fileInPut);

        ISymptomWriter writeSymptomToFileOut = new WriteSymptomToFile(fileOutPut);

        IAnalyticsCounter counterSymptoms = new AnalyticsCounter();

        // Recuperate  List of Symptoms
        List<String> returnee = readSymptomFromFileIn.getSymptoms();

        // count the occurs
        Map<String, Integer> symptomscount = counterSymptoms.analyticsCount(returnee);

        // write all the Symptoms
        writeSymptomToFileOut.writeSymptoms(symptomscount);

    }
}
