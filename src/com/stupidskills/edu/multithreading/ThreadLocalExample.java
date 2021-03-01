package com.stupidskills.edu.multithreading;

public class ThreadLocalExample {

  private String name ;




  public static void main(String[] args) throws InterruptedException {
    Resource resource = new Resource();

    Thread thread1 = new Thread(resource);
    thread1.start();

    Thread thread2 = new Thread(resource);
    thread2.start();

    thread1.join();
    thread2.join();

    //main
    //main.resource.printCount()
    resource.run();
    resource.printCount();


  }
}


/**
 * thread1 - count@509  i
 * thread2 - count@510  i
 */
class Resource implements Runnable {




  public void printCount() {
   // System.out.println(Thread.currentThread().getName() +" "+count.get());
  }

  //T1 - 1000,0000
  //T2 - 2000,0000
  //main method -
  @Override
  public void run() {
    int count = 0;
    for (int i = 0; i < 1000_000; i++) {
      count++;
    }
    System.out.println(Thread.currentThread().getName() + " " + count);
  }
}
