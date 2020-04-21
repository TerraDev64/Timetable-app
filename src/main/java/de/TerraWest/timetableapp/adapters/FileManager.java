package de.TerraWest.timetableapp.adapters.domain;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileManager {

  private FileManager() {}

  public static String readFile(String csvFile) throws IOException {

    var file = new File(csvFile);

    if (!file.exists()) {
      file.createNewFile();
    }

    var fileContent = new StringBuilder();
    var br = new BufferedReader(new FileReader(file));
    var line = "";
    while ((line = br.readLine()) != null) {
      fileContent.append(line).append('\n');
    }

    return fileContent.toString();
  }
}
