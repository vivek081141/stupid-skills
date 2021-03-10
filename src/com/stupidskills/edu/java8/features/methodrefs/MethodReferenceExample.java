package com.stupidskills.edu.java8.features.methodrefs;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MethodReferenceExample {

  /**
   * static method binding
   */
  public  void staticMethodReference() {
    // Referring static method
    ISayable iSayable = (x) -> {
      return Sayable.sayable(x);
    };

    iSayable.say("Hello world");

    ISayable sayable = Sayable::sayable;
    sayable.say("Hello");
  }

  public void nonStaticMethodReference() {
    Sayable object = new Sayable();

    ISayable sayable = x -> object.say(x);
    ISayable iSayable = object::say;
    iSayable.say("Hello");

  }

  public void consumerExample() {
    Consumer<String> consumer = System.out::println;
    Stream<String> stream = Stream.of("One", "Two", "Three");
    stream.forEach(consumer);

  }

  public void predicateExample() {
    Predicate<Integer> predicate = new A()::test;
    Stream<Integer> stream = Stream.of(1, 2, 3);
    stream.filter(predicate);

  }

  public void biFunctionExample() {
    BinaryOperator<Integer> adder1 = (x,y) -> x+y;
    BinaryOperator<Integer> adder2 = Adder::add;
    adder2.apply(1,3);
  }

}

@FunctionalInterface
interface ISayable {
  public abstract String say(String s);

}

class A {

  public boolean test(Integer x) {
    return x > 20;
  }
}


class Sayable{

  public String say() {
    return "Hello";
  }

  public String say(String x) {
    System.out.println(x);
    return x;
  }

  public static String sayable(String x) {
    System.out.println(x);
    return x;
  }

}




class Adder {
  public static Integer add (Integer x, Integer y) {
    return x+y;
  }
}


