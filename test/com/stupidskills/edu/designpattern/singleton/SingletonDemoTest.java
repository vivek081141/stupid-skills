package com.stupidskills.edu.designpattern.singleton;

import org.junit.jupiter.api.Test;

public class SingletonDemoTest {
//java -jar applicationName
  //java SingletonDemoTest.test()
  @Test
  public void test() {
    System.out.println("PrintMy Name");
    System.out.println("PrintMy Name");
    System.out.println(SingletonExample.getInstance().getValue("key"));
    System.out.println(SingletonExample.getInstance().getValue("key"));


    //SingletonDemo.instance

  }
}