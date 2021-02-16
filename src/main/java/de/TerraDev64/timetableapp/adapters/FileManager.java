package de.TerraDev64.timetableapp.adapters;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileManager {
    public static String readFile(String csvFile) throws IOException {
        var file = new File(csvFile);

        if (!file.exists()) {
            file.createNewFile();
        }

        var fileContent = new StringBuilder();
        var br = new BufferedReader(new FileReader(file));
        var line = "";
        while ((line = br.readLine()) != null) {
            //fileContent.append(line).append('\n');
            String[] row = line.split(",");

            for(String index : row) {
                System.out.printf("%-20s", index);
            }
            System.out.println();
        }
        return fileContent.toString();
    }
}
