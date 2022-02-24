package org.com.hemebiotech.main;


import org.com.hemebiotech.analytics.*;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class App
{
    public static void main( String[] args ) throws IOException, AnalyticsException {

        ISymptomReader fiche_in = new ReadSymptomDataFromFile("symptoms.txt");

        ISymptomWriter fiche_out = new WriteSymptomToFile("results_out.txt");

        IAnalyticsCounter Counter_Symptoms = new AnalyticsCounter();

        // Recuperate  List of Symptoms
        List<String> returnee = fiche_in.GetSymptoms();

        // trie the list of Symptoms
        Collections.sort(returnee);

        // count the occurs
        returnee = Counter_Symptoms.analyticsCount(returnee);

        // write all the Symptoms
        fiche_out.writeSymptoms(returnee);

    }
}
