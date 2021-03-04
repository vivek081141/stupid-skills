package com.stupidskills.edu.java8.features.interfaces.consumers;

import com.stupidskills.edu.java8.features.interfaces.model.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@FunctionalInterface
interface IConsumer<T> {
  public void accept(T o) ;
}



public class ConsumerExample {

  public void test() {
    IConsumer consumer = new IConsumer<String>() {
      @Override
      public void accept(String o) {
        System.out.println(o);
      }
    };

    IConsumer<String> lambdaCustomer = (o) -> System.out.println(o);

    lambdaCustomer.accept("Hello world");
  }


  public void test2() {

    Consumer<String> consumer = (x) -> System.out.println(x);
    consumer.accept("Hello World");
  }


  public void test3() {
    List<Person> personList = new ArrayList<Person>();

    personList.add(new Person("A", "30"));
    personList.add(new Person("B", "31"));
    personList.add(new Person("C", "32"));
    personList.add(new Person("D", "33"));

    Consumer<Person> consumer = (person) -> {
      System.out.println(person.toString());
    };

    personList.forEach(consumer);
  }


}



