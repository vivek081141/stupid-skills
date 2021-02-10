package com.stupidskills.edu.staticdemo;

public class Person {

  public static String CONNECTION = "localhost:3030/userid@password";

  public static int age;

  private static String name;

  /**
   *Person a = new Person();
   * a.setName("XYZ");
   *
   *  Person.getName();
   *
   */
  public static String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public static void printName (String name){
    System.out.println(name);
  }
}
