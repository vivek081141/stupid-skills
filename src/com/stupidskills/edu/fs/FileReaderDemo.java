package com.stupidskills.edu.fs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

  public static void main(String[] args) {
    FileReaderDemo demo = new FileReaderDemo();
  }

  public void fileReader(String fileName) throws IOException {
    FileReader reader = new FileReader(fileName);
    int i;
    while ((i = reader.read()) != -1) {
    }

  }


  public void bufferedFileReader(String fileName) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader(fileName));
    String st;
    while ((st = br.readLine()) != null)
      System.out.println(st);
  }
}




