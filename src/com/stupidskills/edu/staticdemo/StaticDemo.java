package com.stupidskills.edu.staticdemo;

public class StaticDemo {

  public static void main(String[] args) {
    Person personA = new Person();
    personA.setName("Vivek");
    personA.age = 28;

    Person personB = new Person();
    personB.setName("Akash");
    personB.age = 30;

    Person personC = null;


    System.out.println(personB.age);

  }


  /**

   MathUtil util = new MathUtil();
   System.out.println(util.sum(2, 5));
   System.out.println(MathUtil.sum(2, 5));

   */
}
