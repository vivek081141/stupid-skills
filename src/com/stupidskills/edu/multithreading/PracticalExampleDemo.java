package com.stupidskills.edu.multithreading;

public class PracticalExampleDemo {

  public static void main(String[] args) throws InterruptedException {

    //job1 - validation
    job1();

    //job2 - processing
    job2();

    //saving in db
    job3();

    //notification
    Runnable notificationHandler = new NotificationHandler();
    Thread thread = new Thread(notificationHandler);
    thread.start(); // 10 minutes

    //this thread is saying that wait for me to finish to the main thread
    thread.join();

  }

  private static void job3() {
    for (int i = 0; i < 100; i++) {
      System.out.println("saving in db");
    }
  }


  private static void job2() {
    for (int i = 0; i < 100; i++) {
      System.out.println("processing in db");
    }

  }

  private static void job1() {
    for (int i = 0; i < 100; i++) {
      System.out.println("server side validation");
    }
  }


}

class NotificationHandler implements Runnable {
  public NotificationHandler() {

  }

  @Override
  public void run() {
    //send some notification
    System.out.println(Thread.currentThread().getName() + " Sending notification");
    System.out.println(Thread.currentThread().getName() + " Sending notification");
    System.out.println(Thread.currentThread().getName() + " Sending notification");
    System.out.println(Thread.currentThread().getName() + " Sending notification");
    System.out.println(Thread.currentThread().getName() + " Sending notification");
  }
}
