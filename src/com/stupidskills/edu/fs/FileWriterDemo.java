package com.stupidskills.edu.fs;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class FileWriterDemo {


  public static void main(String[] args) throws IOException {
    System.getProperty("user.dir");
    FileWriterDemo demo = new FileWriterDemo();
    demo.writeBufferedOutputStream("BufferedOutputStream:This can be my data which I want to write in filesystem.");
  }


  public void writeFileOutputStream(String data) throws IOException {
    File file = new File("abc.txt");
    OutputStream stream = new FileOutputStream(file);
    stream.write(data.getBytes());
    stream.flush(); //we are forcing the I/O operation
    stream.close();
  }


  public void writeBufferedOutputStream(String data) throws IOException {
    File file = new File("abc.txt");
    OutputStream outputStream = new FileOutputStream(file);
    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
    bufferedOutputStream.write(data.getBytes());
    bufferedOutputStream.close();

    Files.write(file.toPath(), data.getBytes(), StandardOpenOption.CREATE  );

    FileWriter fw = new FileWriter(file);
    fw.write(data);
    fw.flush();
    fw.write(data);
    fw.write(data);
    fw.write(data);

  }
}


