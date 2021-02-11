package com.stupidskills.edu.oop.inheritance.example2;

/**
 * instance intialization block
 */
public class ClassicWatch {

  private int speed = 30;

  {
    speed = 20;
  }

  public  ClassicWatch() {
    System.out.println(speed);
    speed = 40;
    System.out.println(speed);
  }


  public String getTime() {
    return "Current time in classical format";
  }
}
