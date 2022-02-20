package org.com.hemebiotech.analytics;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadSymptomDataFromFile implements ISymptomReader {
    private final String filepath ;
    private final String fileout ;


    /**
     *
     * @param filepath nom du fichier en entrée
     * @param fileout nom du fichier en sortie
     */
    public ReadSymptomDataFromFile(String filepath, String fileout)
    {
          this.filepath = filepath;
        this.fileout = fileout;
    }

    /**
     *
     * @return retourne la liste des Symptoms
     */
    @Override
    public List<String> GetSymptoms() {
        List<String> result = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader (new FileReader(filepath));
            String line = reader.readLine();
            while (line != null) {
                result.add(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }


    @Override
    public void WriteSymptoms(String file) throws IOException {
        try (FileWriter writer = new FileWriter(fileout, true)) {
            writer.write(file + "\n");
        }
        // quoiqu'il arrive, on ferme le fichier
    }
    }
