package com.stupidskills.edu.java8.features.interfaces;

import com.stupidskills.edu.java8.features.interfaces.consumers.ConsumerExample;
import org.junit.jupiter.api.Test;

class ConsumerExampleTest {
  private ConsumerExample example = new ConsumerExample();

  @Test
  void test1() {
    example.test();
  }


  @Test
  void test2() {
    example.test2();
  }


  @Test
  void test3() {
    example.test3();
  }
}