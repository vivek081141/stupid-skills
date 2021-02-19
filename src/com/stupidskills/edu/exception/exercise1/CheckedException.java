package com.stupidskills.edu.exception.exercise1;

public class CheckedException {

  public void test() {
    try {
      Class.forName("myPackage.exampl.Sample");
    }catch (ClassNotFoundException ex) {
      ex.printStackTrace();
    }
  }
}
