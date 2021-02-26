package com.stupidskills.edu.exception.exercises;

public class CheckedException {

  public void classNotFoundException() {
    try {
      Class.forName("myPackage.exampl.Sample");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
      
    }


  }

}
