package com.stupidskills.edu.oop.abstraction.interfaces;

//ShapeDemo.main([]); -> printArea()
// ShapeDemo object = new ShapeDemo()
//object.printArea();
public class ShapeDemo {

  public static void main(String[] args) {
    Shape rectangle = new Rectangle(10, 14);
    Shape circle = new Circle(2);

    printArea(rectangle);
    printArea(circle);

  }

  private static void printArea(Shape shape) {
    System.out.println("Area " + shape.area());
  }
}
