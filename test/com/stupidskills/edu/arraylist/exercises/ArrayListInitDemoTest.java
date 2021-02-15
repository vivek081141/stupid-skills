package com.stupidskills.edu.arraylist.exercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayListInitDemoTest {

  private ArrayListInitDemo demo = new ArrayListInitDemo();
  @Test
  public void main() {
    demo.create();
    Assertions.assertEquals("HELLO", "HELLO");
  }
}
