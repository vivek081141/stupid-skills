package com.stupidskills.edu.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class SerializableExample {


  public  Car serialization(Car car, String filename) {

    try (final OutputStream fos = new FileOutputStream(filename);
         final ObjectOutputStream outerStream = new ObjectOutputStream(fos);){

      // Method for serialization of object
      outerStream.writeObject(car);
      outerStream.flush();

    } catch (IOException e) {
      e.printStackTrace();
    }

    return car;
  }

  public  com.stupidskills.edu.serialization.Car deserialization(String filename) {
    Car car = null;
    try (  FileInputStream fis = new FileInputStream(filename);
           ObjectInputStream ois = new ObjectInputStream(fis)){

      // Method for deserialization of object
      car = (com.stupidskills.edu.serialization.Car) ois.readObject();

    } catch (IOException ex) {
      System.out.println("IOException is caught");
    } catch (ClassNotFoundException ex) {
      System.out.println("ClassNotFoundException" + " is caught");
    }

    return car;
  }
}
