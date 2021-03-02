package com.stupidskills.edu.multithreading.executors;

import java.io.File;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Problem - directory - contains - 10 files - 1000 file - 1 M
 * List of files  - filesNames
 * for each file
 *
 * 1. convert csv into POJO List<User> 5,000</User>
 * 2. POJO - validation
 * 3. store in db
 *
 */



public class ExecutorExample {

  private static String filePath = "resource/files";

  public void sequentialFlow() {
    File directory = new File(filePath);

    Long time = System.currentTimeMillis();
    for (File file : directory.listFiles()) {

      MyRunnableJob runnableJob = new MyRunnableJob(file);
      runnableJob.run();
    }
    System.out.println("Time Taken to finish the job " + ((System.currentTimeMillis() - time)));

  }

  //
  public void executorService() {
    ExecutorService executorService = Executors.newCachedThreadPool();

    File directory = new File(filePath);

    Long time = System.currentTimeMillis();  //6:14:15 in timestamp = 6141500000

    //10
    for (File file : directory.listFiles()) {

      //main
      //thread1 - file0
      //thread2 - file1
      //thread8 - file7
      executorService.execute(new MyRunnableJob(file));

    }

    //main thread
    executorService.shutdown(); //tasks when they will get completed.

    while (!executorService.isTerminated()) {
      //loop until all the threads have been executed.
    }

    System.out.println("Time Taken to finish the job " + ((System.currentTimeMillis() - time)));

  }
}

class MyRunnableJob  implements  Runnable {
  private File file;

  public MyRunnableJob(File file) {
    this.file = file;
  }

  @Override
  public void run() {

    //1. read the CSV File
    System.out.println(Thread.currentThread().getName() + " : Reading File: " + file.getName() );
    CSVFileReader csvFileReader = new CSVFileReader(file);
    List<User> users = csvFileReader.parseCSVFile();

    // 2. Process it + Validations
    System.out.println(Thread.currentThread().getName() + " : Processing File: " + file.getName() + " : size:: "+ users.size() );
    FileProcessor processor = new FileProcessor(users);
    List<User> userList = processor.process();

    // 3. save it in db or something
    System.out.println(Thread.currentThread().getName() + " : Saving File: " + file.getName() + " : size:: "+ users.size() );
    UserRepository repository = new UserRepository();
    repository.save(userList);
  }




}

/*class BatchJob {

  private File file;

  public BatchJob(File file) {
    this.file = file;
  }

  protected void processJob() {

  }
}*/


