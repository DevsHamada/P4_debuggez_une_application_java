package org.com.hemebiotech.analytics;


import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class App
{
    public static void main( String[] args ) throws IOException {

        ReadSymptomDataFromFile fiche = new ReadSymptomDataFromFile("symptoms.txt", "results_out.txt");

        // Recuperate  List of Symptoms
        List<String> returnee = fiche.GetSymptoms();

        // trie the list of Symptoms
        Collections.sort(returnee);

        // count the occurs
        returnee = fiche.OccursCounter(returnee);

        // write all the Symptoms
        for (String s : returnee) fiche.WriteSymptoms(s);
    }
}
