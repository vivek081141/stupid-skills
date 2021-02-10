package com.stupidskills.edu.oop.instanceinit;

public class Demo {

  public static void main(String[] args) {
    A a = new B2();

  }
}


class A{
  A(){
    System.out.println("parent class constructor invoked");
  }
}


class B2 extends A{
  B2(){
    super();
    System.out.println("child class constructor invoked");
  }

  {System.out.println("instance initializer block is invoked");}


}
