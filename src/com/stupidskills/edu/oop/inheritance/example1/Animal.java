package com.stupidskills.edu.oop.inheritance.example1;

public class Animal {

  private int noOfLegs;

  public void eat() {
    System.out.println("All animals eat");
  }

  protected void printWalk() {
    System.out.println("I have " + noOfLegs +" of legs");
  }
}
