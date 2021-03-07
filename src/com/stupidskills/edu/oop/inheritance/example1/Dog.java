package com.stupidskills.edu.oop.inheritance.example1;


/**
 * Dog IS-A Animal
 * Dog is a derived Class
 *
 * old class - old implementation
 * new class - 90% - 10%
 */
public class Dog extends Animal {
  protected  String nickName;

  /*
   protected String name;
   protected int noOfLegs;
   */

  public Dog(String name, String nickName) {
    super(name, 4); //calling the constructor of parent class
    this.nickName = nickName;
  }

  /**
   * Dog can override the existing methods or properties
   * Override : we are overriding this function
   */
  @Override
  public void eat() {
    System.out.println("Dog eats biscuits");
  }

  /**
   *   public void walk() {
   *     System.out.println("I have " + noOfLegs +" of legs");
   *   }
   */
}
