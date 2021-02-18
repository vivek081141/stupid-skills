package com.stupidskills.edu.oop.abstraction.interfaces;

/**
 * Circle IS A Shape
 */
public class Circle implements Shape, MarkerInterface {

  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public double area() {
    return 3.14 * radius * radius;
  }

  @Override
  public double volume() {
    return 4/3 * 3.14 * radius * radius * radius;
  }

  @Override
  public void setParameter(double radius) {
    this.radius = radius;
  }
}
