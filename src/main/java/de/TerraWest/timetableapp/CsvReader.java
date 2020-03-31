package de.TerraWest.timetableapp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class CsvReader {
    public void readFile() {
        System.out.println("done");

        String csvFile = "C:\\Users\\Christian\\Documents\\JavaProjects\\Timetable-App\\src\\main\\resources\\Stundenplan 19-20.csv";
        String line = "";
        String csvSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as seperator
                String[] row = line.split(csvSplitBy);
                //String timetable = String.format("");
                System.out.println(
                         row [0]
                        +row [1]
                        +row [2]
                        +row [3]
                        +row [4]
                        +row [5]
                );
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
