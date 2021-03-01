package com.stupidskills.edu.multithreading.executors;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ExecutorExampleTest {

  private ExecutorExample example = new ExecutorExample();

  //4145
  @Test
  public void testSequentialFlow () {
    Long time = System.currentTimeMillis();
    example.sequentialFlow();
    System.out.println("FINAL Time Taken to finish the job " + ((System.currentTimeMillis() - time)));


  }

  //19073
  @Test
  public void testExecutorThreadFlow () {
    Long time = System.currentTimeMillis();

    for (int i = 0; i < 100; i++) {
    example.executorService();
    }
    System.out.println("FINAL Time Taken to finish the job " + ((System.currentTimeMillis() - time)));

  }
}