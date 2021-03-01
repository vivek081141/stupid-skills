package com.stupidskills.edu.multithreading.executors;

import java.io.File;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {

  private static String filePath = "resource/files";

  public void sequentialFlow() {
    File directory = new File(filePath);

    Long time = System.currentTimeMillis();
    for (File file : directory.listFiles()) {

      MyRunnableJob runnableJob = new MyRunnableJob(file);
      runnableJob.processJob();
    }
    System.out.println("Time Taken to finish the job " + ((System.currentTimeMillis() - time)));

  }

  public void executorService() {
    //ExecutorService executorService = Executors.newFixedThreadPool(8);
     ExecutorService executorService = Executors.newScheduledThreadPool(10);

    File directory = new File(filePath);

    Long time = System.currentTimeMillis();
    for (File file : directory.listFiles()) {

      executorService.execute(new MyRunnableJob(file));

    }
    executorService.shutdown();
    while (!executorService.isTerminated()) {
    }
    System.out.println("Time Taken to finish the job " + ((System.currentTimeMillis() - time)));

  }
}

class MyRunnableJob implements  Runnable {
  private File file;

  public MyRunnableJob(File file) {
    this.file = file;
  }

  @Override
  public void run() {
    processJob();
  }

  public void processJob() {
    System.out.println(Thread.currentThread().getName() + " : Reading File: " + file.getName() );
    CSVFileReader csvFileReader = new CSVFileReader(file);
    List<User> users = csvFileReader.parseCSVFile();

    // 2. Process it
    System.out.println(Thread.currentThread().getName() + " : Processing File: " + file.getName() + " : size:: "+ users.size() );
    FileProcessor processor = new FileProcessor(users);
    List<User> userList = processor.process();

    // 3. save it in db or something
    System.out.println(Thread.currentThread().getName() + " : Saving File: " + file.getName() + " : size:: "+ users.size() );
    UserRepository repository = new UserRepository();
    repository.save(userList);
  }


}


