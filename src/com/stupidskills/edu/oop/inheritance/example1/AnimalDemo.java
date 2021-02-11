package com.stupidskills.edu.oop.inheritance.example1;

public class AnimalDemo {

  public static void main(String[] args) {
    Dog dog = new Dog();
    dog.eat();

    Animal animal = new Animal();

    Animal dogReference = new Dog();

    Cow cow = new Cow();

    //1st implementation will get called
    performOperation(animal);

    //2nd implementation
    performOperation(dog);

    //2nd implementation
    performOperation(cow);

    performOperation(dogReference);

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
