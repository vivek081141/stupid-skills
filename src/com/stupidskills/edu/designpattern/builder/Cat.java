package com.stupidskills.edu.designpattern.builder;

public class Cat {
  private String name;

  public Cat() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public static void printName() {
    Cat.printName();
    Cat cat = new Cat();
  }

}
