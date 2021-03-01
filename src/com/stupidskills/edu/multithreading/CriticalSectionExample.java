package com.stupidskills.edu.multithreading;

public class CriticalSectionExample {

  public static void main(String[] args) throws InterruptedException {
    LocalResource resource = new LocalResource();


    Thread thread1 = new Thread(resource);
    thread1.setName("Thread 1");
    thread1.setPriority(Thread.MAX_PRIORITY);
    thread1.start();

    Thread thread2 = new Thread(resource);
    thread1.setPriority(Thread.MIN_PRIORITY);
    thread1.setName("Thread 2");
    thread2.start();

    thread1.join();
    thread2.join();

    resource.print();
  }
}

/**
 * LocalResource IS-A Runnable
 *
 * OUTPUT - 1,161,478 1,133,514, 1,164,179
 * Thread 1 -      count = 2             Thread2
 * READ - count=0                        count = 1
 * count = 1                             count = 2
 * count = 3, 4                              count = 3, 4
 *
 *
 * value - registers
 *
 */
class LocalResource implements Runnable {
  private  volatile Integer count = 0; //heap

  public void print() {
    System.out.println(count);
  }

  @Override
  public synchronized void run() {
    for (int i = 0; i <1000_000; i++) {
     //read the data
      // writing the data
     count = count + 1;
    }
  }
}
