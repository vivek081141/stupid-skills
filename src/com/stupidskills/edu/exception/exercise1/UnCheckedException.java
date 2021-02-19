package com.stupidskills.edu.exception.exercise1;

import com.stupidskills.edu.Student;
import com.stupidskills.edu.sort.comparable.Player;

public class UnCheckedException {

  public void arithmaticTest() {
    int x = 100 / 0 ;
  }

  public void nullPointerTest() {
    String str = null;
    System.out.println(str.length());
  }

  public void classCastException() {
    Student student = new Student("V", 30);
    Object obj = student;
    Player s = (Player) obj;
  }
}
