package com.stupidskills.edu.multithreading.executors;

import org.junit.jupiter.api.Test;

public class ExecutorExampleTest {

  private ExecutorExample example = new ExecutorExample();

  //3048, 3032
  //Time taken:99738
  //memory: 600 MB , thread = 28
  //9 files * 100 = 900
  @Test
  public void testSequentialFlow () {
    Long time = System.currentTimeMillis();
    for (int i = 0; i < 100; i++) {
      example.sequentialFlow();
    }
    System.out.println("FINAL Time Taken to finish the job " + ((System.currentTimeMillis() - time)));


  }

  //4154
  //2754

  //Time taken for 100*9 files = 45220
  // java - 3.52 GB threads = 32-38
  @Test
  public void testExecutorThreadFlow () {
    Long time = System.currentTimeMillis();
    for (int i = 0; i < 100; i++) {
      example.executorService();
    }

    System.out.println("FINAL Time Taken to finish the job " + ((System.currentTimeMillis() - time)));

  }
}