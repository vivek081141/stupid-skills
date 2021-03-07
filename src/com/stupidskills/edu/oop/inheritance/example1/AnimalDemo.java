package com.stupidskills.edu.oop.inheritance.example1;

public class AnimalDemo {

  public static void main(String[] args) {
    Animal animal = new Animal("Kitty");
    Dog dog = new Dog("Mr Rotwilier", "Rocky");
    dog.eat();

  }


  /**
   *
   * Reference is ANimal
   * @param animal
   */
  /**
   * All out methods should be defined for base classes
   * @param animal
   */
  public static void performOperation(Animal animal) {
    //run time polymorphism as implementation is decided during run time.
    animal.eat();

  }

  //method overloading
  public static void performOperation(Animal animal, int x) {
  }

  public static void performOperation(Animal animal, String x) {
  }


}
