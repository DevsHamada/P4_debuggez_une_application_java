package org.com.hemebiotech.analytics;


import java.util.Collections;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ReadSymptomDataFromFile fiche = new ReadSymptomDataFromFile("symptoms.txt");
        List<String> myretur;

        myretur = fiche.GetSymptoms();
        Collections.sort(myretur);
        for(int i = 0 ; i < myretur.size(); i++)
        {
            int frequenceaa = Collections.frequency(myretur,myretur.get(i));
            if (i+1 != myretur.size())
            {
                if (myretur.get(i).equals(myretur.get(i + 1))) {
                    continue;
                } else {
                    System.out.println(myretur.get(i) + " " + frequenceaa);
                }
            }

        }


        //for(int i = 0 ; i < myretur.size(); i++)
          //  System.out.println(myretur.get(i));

    }
}
