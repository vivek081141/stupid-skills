package com.stupidskills.edu.designpattern.singleton;

public class SingletonDemo {

  public static void main(String[] args) {
    System.out.println("Testing");

    trymethod1();
  }

  private static void trymethod1() {
    SingletonExample.getInstance().getValue("");
    System.out.println(SingletonExample.getInstance().getValue("key"));
    SingletonExample.getInstance().clo
  }
}
