package com.stupidskills.edu.staticdemo;

public class Person {

  public static String CONNECTION = "localhost:3030/userid@password";

  public static int age;

  private String name; //instance variable

  /**
   *Person a = new Person();
   * a.setName("XYZ");
   *
   *  Person.getName();
   *
   */
  public  String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public static void printName (String name){
    System.out.println(name);
  }
}
