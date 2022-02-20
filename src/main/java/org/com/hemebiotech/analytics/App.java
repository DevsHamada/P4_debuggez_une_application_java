package org.com.hemebiotech.analytics;


import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class App
{
    public static void main( String[] args ) throws IOException {
        ReadSymptomDataFromFile fiche = new ReadSymptomDataFromFile("symptoms.txt", "results_out.txt");
        List<String> returnee;
        returnee = fiche.GetSymptoms();
        Collections.sort(returnee);

        for(int i = 0 ; i < returnee.size(); i++)
        {
            int Frequencies = Collections.frequency(returnee,returnee.get(i));
            if (i+1 != returnee.size())
            {
                if (returnee.get(i).equals(returnee.get(i + 1))) {
                    continue;
                } else {
                    fiche.WriteSymptoms(returnee.get(i)+ " = " + Frequencies);
                    System.out.println(returnee.get(i) + " = " + Frequencies);
                }
            }
        }
    }
}
