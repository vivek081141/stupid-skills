package com.stupidskills.edu.multithreading;

public class CriticalSectionExample {

  public static void main(String[] args) throws InterruptedException {
    LocalResource resource = new LocalResource();
    Thread thread1 = new Thread(resource);
    thread1.start();

    Thread thread2 = new Thread(resource);
    thread2.start();

    thread1.join();
    thread2.join();

    resource.print();
  }
}


class LocalResource implements Runnable {
  private  Integer count = 0;

  public void print() {
    System.out.println(count);
  }

  @Override
  public void run() {
    for (int i = 0; i <1000; i++) {
      count++;
    }
  }
}
