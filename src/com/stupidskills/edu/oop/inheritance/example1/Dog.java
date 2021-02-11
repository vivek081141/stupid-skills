package com.stupidskills.edu.oop.inheritance.example1;


public class Dog extends Animal {

  /**
   * Method overriding
   */
  @Override
  public void eat() {
    System.out.println("Dog eats biscuits");
  }

  public void print() {
    printWalk();
  }
}
