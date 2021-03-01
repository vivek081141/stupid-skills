package com.stupidskills.edu.multithreading.executors;

import java.util.List;

public class FileProcessor {

  private List<User> users;

  public FileProcessor(List<User> users) {
    this.users = users;
  }

  public List<User> process() {
    return this.users;
  }
}
