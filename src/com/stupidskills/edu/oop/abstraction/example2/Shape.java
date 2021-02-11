package com.stupidskills.edu.oop.abstraction.example2;

/**
 * Interface
 */
public interface Shape {

  public final static String name ="SHAPE";

  public abstract double area();

  public abstract double volume();

  public default void setParameter(double radius) {
    //no implementation
  }
}
