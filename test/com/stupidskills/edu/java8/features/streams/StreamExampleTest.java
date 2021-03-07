package com.stupidskills.edu.java8.features.streams;

import org.junit.jupiter.api.Test;

class StreamExampleTest {

  StreamExample example = new StreamExample();
  @Test
  void test1() {
    example.filter();
  }

  @Test
  void peakTest() {
    example.peak();
  }

  @Test
  void flatMapTest() {
    example.flatMap();
  }

  @Test
  void reduceTest() {
    example.reduce();
  }
}