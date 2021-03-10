package com.stupidskills.edu.java8.features.methodrefs;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MethodReferenceExampleTest {

  MethodReferenceExample example = new MethodReferenceExample();

  @Test
  void staticMethodReference() {
    example.staticMethodReference();
  }

  @Test
  void nonStaticMethodReference() {
  }
}