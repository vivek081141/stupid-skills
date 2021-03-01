package com.stupidskills.edu.multithreading;

import java.io.Serializable;

public class RunnableExample {

  public static void main(String[] args) throws InterruptedException {
    Runnable tableWriter1 = new RunnableDemo(10);
    Runnable tableWriter2 = new RunnableDemo(11);
    Runnable tableWriter3 = new RunnableDemo(12);

    //ExecuterService - create the new thread and then we will pass the Runnable to it
    Thread thread1 = new Thread(tableWriter1);
    Thread thread2 = new Thread(tableWriter2);
    Thread thread3 = new Thread(tableWriter3);
    //main
    thread1.setName("thread 0");
    thread1.start();

    thread2.setName("thread 1");
    thread2.start();

    thread3.setName("thread 2");
    thread3.start();


    thread1.join();
    thread2.join();
    thread3.join();

  }
}

/**
 * RunnableDemo IS-A Runnable
 */
class RunnableDemo implements Runnable {
  private int x;

  public RunnableDemo(int x){
    this.x = x;
  }


  @Override
  public void run() {
    for (int i = 1; i< 10; i++){
      System.out.println(Thread.currentThread().getName() + " :"+ x*i);
    }

  }
}