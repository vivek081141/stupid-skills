package com.stupidskills.edu.multithreading;

public class ThreadExample {

  public  void requestController(String[] args) throws InterruptedException {

    TableWriter thread0 = new TableWriter(10);
    TableWriter thread1 = new TableWriter(11);
    TableWriter thread2 = new TableWriter(12);


    //main
    thread0.setName("thread 0");
    thread0.setPriority(Thread.MAX_PRIORITY);
    thread0.start(); //thread0

    //thread1 - i=1 - 3
    //thread0 - i=1 - 5

    thread1.setName("thread 1");
    thread1.setPriority(Thread.MIN_PRIORITY);
    thread1.start(); //thread1

    thread2.setName("thread 2");
    thread2.setPriority(Thread.MIN_PRIORITY);
    thread2.start(); //thread2

    //OS, if main thread terminates, then other threads will also die
    // thread.join() -> wait, I am still running.

   /* thread0.join();
    thread1.join();
    thread2.join();*/
    //main can remain idle or it can die
    // or if it has to return, it will return



  }


}

//TableWriter IS-A Thread
class TableWriter extends Thread {
  private int x;

  public TableWriter(int x) {
    this.x = x;
  }

  //thread 0 i = 2, x = 10
  //thread 1 i = 2 ,x = 11
  //thread 2 i = 5. x = 12
  @Override
  public void run() {
    for (int i = 1; i <= 10; i++) {
      System.out.println(Thread.currentThread().getName() + " " + i * x);
    }
  }

}




