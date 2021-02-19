package com.stupidskills.edu.exception.exercise1;

import org.junit.jupiter.api.Test;

public class UnCheckedExceptionTest {

  UnCheckedException exception = new UnCheckedException();
  @Test
  public void test1() {
    exception.arithmaticTest();
  }

  @Test
  public void test2() {
    exception.classCastException();
  }

}