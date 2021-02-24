package com.stupidskills.edu.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableExample {

  public static void main(String[] args) {
    Car car = new Car();
    String filename = "file.txt";

    serialization(car, filename);

    deseialization(filename);
  }



  private static Car serialization(Car car, String filename) {
    try {

      FileOutputStream file = new FileOutputStream(filename);
      ObjectOutputStream out = new ObjectOutputStream(file);

      // Method for serialization of object
      out.writeObject(car);

      out.close();
      file.close();


    } catch (IOException ex) {
      System.out.println("IOException is caught");
    }

    return car;
  }

  private static Car deseialization(String filename) {
    Car car = null;
    try {

      // Reading the object from a file
      FileInputStream file = new FileInputStream(filename);
      ObjectInputStream in = new ObjectInputStream(file);

      // Method for deserialization of object
      car = (Car) in.readObject();

      in.close();
      file.close();

    } catch (IOException ex) {
      System.out.println("IOException is caught");
    } catch (ClassNotFoundException ex) {
      System.out.println("ClassNotFoundException" + " is caught");
    }

    return car;
  }
}
