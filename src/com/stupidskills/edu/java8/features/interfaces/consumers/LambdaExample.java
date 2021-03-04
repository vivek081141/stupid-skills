package com.stupidskills.edu.java8.features.interfaces.consumers;

public class LambdaExample {

  public void test() {

    ILambdaExample example = new ILambdaExample() {
      @Override
      public void print(String x) {
        System.out.println(x);
      }
    };

    example.print("hello world");
    example.printMyName("hello world");
  }

  public void test2() {

    ILambdaExample example = /** public void print **/ ( /** String **/ x) -> {
      System.out.println(x);
    } ;

    //consumer - consumes
    ILambdaExample example2 = (x) -> {
      System.out.println(x);
    };

    example.print("hello world");
    example.printMyName("hello world");
  }
}



@FunctionalInterface
interface ILambdaExample {

  abstract public void print(String x);

  default public void printMyName(String x){
    System.out.println(x);
  }

}



abstract class AbstractExmaple {
  abstract public void print(String x);

  public void printMyName() {
    System.out.println("Need");
  }
}
