package com.stupidskills.edu.oop.inheritance.example1;


/**
 * Base
 */
public class Animal {

  protected String name;
  protected int noOfLegs;

  public Animal() {
  }

  public Animal(String name) {
    this.name = name;
  }

  public Animal(String name, int legs) {
    this.name = name;
    this.noOfLegs = legs;
  }

  public void eat() {
    System.out.println("All animals eat");
  }

  public void walk() {
    System.out.println("I have " + noOfLegs +" of legs");
  }
}
