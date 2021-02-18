package com.stupidskills.edu.oop.abstraction.interfaces;

public class Rectangle implements Shape{

  private float length, breadth, height;

  /** Constructor Overloading **/
  public Rectangle(float length, float breadth) {
    this.breadth = breadth;
    this.length = length;
  }

  public Rectangle(float length, float breadth, float height) {
    this.length = length;
    this.breadth = breadth;
    this.height = height;
  }

  @Override
  public double area() {
    return length * breadth;
  }

  @Override
  public double volume() {
    return length * breadth * height;
  }
}
