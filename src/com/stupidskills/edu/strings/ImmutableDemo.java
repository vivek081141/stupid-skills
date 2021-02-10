package com.stupidskills.edu.strings;

public class ImmutableDemo {

  public static void main(String[] args) {
    //immutability
    //array is mutable
    //objects are mutable unless strictly specified
    String[] data = {"Hello", "World"};

    functionXYZ(data);

    System.out.println(data[0]);

    //immutability
    String immutableData = "hello world"; //501@abcd
    functionXYZ(immutableData);
    System.out.println(immutableData);

    immutableData = "New Hello WOrld"; //503@abcd

    //504@abcd
    immutableData = immutableData + "Adding";

    immutableData.trim();

    System.out.println(immutableData);

  }

  //client
  private static void functionXYZ(String[] data) {
    data[0] = "Modifying this value";
  }

  private static void functionXYZ(String immutableData) { ////501@abcd
    immutableData = "Modifying this value"; //it will create a new object
    ////502@abcd
    System.out.println(immutableData);
  }


}
