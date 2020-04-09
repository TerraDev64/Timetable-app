package de.TerraWest.timetableapp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class CsvReader {

    public void readFile(String csvFile) {
        final String csvSplitBy = ",";

        try (var br = new BufferedReader(new FileReader(csvFile))) {
            String line = "";


        } catch (IOException eIO) {
            System.out.println("File not Found " + eIO);
        }
    }
    //Parameters for using variables from other functions
    public void showFile(String csvFile, String csvSplitBy) {

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line = "";

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
        } catch (IOException eIO) {
            System.out.println("error: " + eIO);
            eIO.printStackTrace();
        }
    }

    public void outputFile() {

    }
}
