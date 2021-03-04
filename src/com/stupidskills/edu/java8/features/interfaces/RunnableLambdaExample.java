package com.stupidskills.edu.java8.features.interfaces;

class RunnableImpl implements Runnable {
  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName() + " I am running");
  }
}

public class RunnableLambdaExample {

  public void test() {
    Thread thread = new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println(Thread.currentThread().getName() + " I am running");

      }
    });
    thread.start();
  }


  public void test2() {
    Thread thread = new Thread(
    () -> {
      System.out.println(Thread.currentThread().getName() + " I am running");
    }
    ) ;
    thread.start();
  }

}
