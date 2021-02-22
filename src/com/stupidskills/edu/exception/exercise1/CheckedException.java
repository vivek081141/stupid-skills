package com.stupidskills.edu.exception.exercise1;

import com.stupidskills.edu.Student;

public class CheckedException {

  public void classNotFoundException() {
    try {
      Class.forName("myPackage.exampl.Sample");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
      
    }


  }

}
