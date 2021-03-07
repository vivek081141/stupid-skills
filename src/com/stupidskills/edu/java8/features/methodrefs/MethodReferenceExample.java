package com.stupidskills.edu.java8.features.methodrefs;

public class MethodReferenceExample {

  public static void main(String[] args) {
    // Referring static method
    ISayable sayable = Sayable::sayable;

    //non-static method
    Sayable sayable1 = new Sayable();
    ISayable sayable2 = x -> sayable1.say(x);

    // Calling interface method
    sayable.say("Hello");
  }

}

class Sayable{

  public String say(String x) {
    System.out.println(x);
    return x;
  }

  public static String sayable(String x) {
    System.out.println(x);
    return x;
  }

}

@FunctionalInterface
interface ISayable {
  public String say(String s);
}