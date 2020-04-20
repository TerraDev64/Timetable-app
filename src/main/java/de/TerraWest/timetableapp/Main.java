package de.TerraWest.timetableapp;


public class Main {
    public static void main(String[] args) {
        //String file = args[0];
        var CsvReader = new CsvReader();
        //var showFile = new show
        System.out.println(System.getProperty("file"));
        CsvReader.readFile(System.getProperty("file"));

    }
}

// -Dfile="Stundenplan_19-20.csv"