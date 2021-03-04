package com.stupidskills.edu.multithreading.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    CallableRunner runner = new CallableRunner();

    ExecutorService executorService = Executors.newSingleThreadExecutor();
    Future<String> future = executorService.submit(new CallableRunner());

    executorService.shutdown();

    System.out.println(future.get());
  }
}

class CallableRunner implements Callable<String>{


  @Override
  public String call() throws Exception {
    //i am doing some here
    return "Task has been completed";
  }
}

class RunnableEx implements Runnable{


  @Override
  public void run() {

  }
}