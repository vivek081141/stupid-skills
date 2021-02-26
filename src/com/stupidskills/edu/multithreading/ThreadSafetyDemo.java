package com.stupidskills.edu.multithreading;

public class ThreadSafetyDemo {
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


class LocalRes implements Runnable {

  public void print() {
  }

  @Override
  public void run() {
    LocalObject object = new LocalObject();
    System.out.println(Thread.currentThread().getName() + " "+ object.toString());
    for (int i = 0; i < 1000_000; i++) {
      object.setCount(object.getCount() + 1);
    }

    System.out.println(object.getCount());
  }
}

class LocalObject {
  int count ;

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }
}