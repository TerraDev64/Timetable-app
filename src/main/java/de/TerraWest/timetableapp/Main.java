package de.TerraWest.timetableapp;


public class Main {
    public static void main(String[] args) {
        var CsvReader = new CsvReader();
        //var showFile = new show
        System.out.println(System.getProperty("file"));
        CsvReader.readFile(System.getProperty("file"));

    }
}
