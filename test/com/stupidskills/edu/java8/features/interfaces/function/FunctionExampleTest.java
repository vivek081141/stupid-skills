package com.stupidskills.edu.java8.features.interfaces.function;

import com.stupidskills.edu.java8.features.streams.Product;
import org.junit.jupiter.api.Test;

class FunctionExampleTest {

  private FunctionExample example = new FunctionExample();

  @Test
  void test1() {
    Product product = new Product("AC", 35f);
    example.test(product);
  }
}