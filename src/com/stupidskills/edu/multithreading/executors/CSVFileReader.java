package com.stupidskills.edu.multithreading.executors;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVFileReader {

  private File file;

  public CSVFileReader(File file) {
    this.file = file;
  }

  public List<User> parseCSVFile() {
    BufferedReader br;
    List<User> userList = new ArrayList<>();
    try {

      String line;
      FileReader reader = new FileReader(file);
      br = new BufferedReader(reader);
      br.lines().skip(1);
      while ((line = br.readLine()) != null) {
        String[] p = line.split(",");
        User item = new User();
        item.setFirstName(p[1]);
        item.setLastName(p[2]);
        item.setEmail(p[3]);
        item.setGender(p[4]);
        item.setCity(p[5]);
        userList.add(item);
      }

    } catch (IOException e) {
      System.err.println(e.getMessage());
    }
    return userList;
  }
}
