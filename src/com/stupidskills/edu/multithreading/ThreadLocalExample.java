package com.stupidskills.edu.multithreading;

public class ThreadLocalExample {

  public static void main(String[] args) throws InterruptedException {
    Resource resource = new Resource();
    Thread thread1 = new Thread(resource);
    Thread thread2 = new Thread(resource);
    thread1.start();
    thread2.start();

    thread1.join();
    thread2.join();

  }
}

class Resource implements Runnable {
  private ThreadLocal<Integer> count = new ThreadLocal<>(){
    @Override
    protected Integer initialValue()
    {
      return 0;
    }
  };


 /* public void printCount() {
    System.out.println(Thread.currentThread().getName() +" "+count.get());
  }*/

  @Override
  public void run() {

    System.out.println(Thread.currentThread().getName() +" "+count.get());
  }
}
