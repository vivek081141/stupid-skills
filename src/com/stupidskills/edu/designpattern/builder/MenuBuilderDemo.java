package com.stupidskills.edu.designpattern.builder;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MenuBuilderDemo {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();

    Consumer<String> consumer = (x) -> System.out.println(x);
    Consumer<String> consumer1 = (x) -> {
      x = x + 10;
      System.out.println(x);
    };

    consumer.accept("Hello");

    list.forEach(consumer);

    Predicate<String> predicate = (x) -> {
      if (x!=null && x.equals("HEY")) {
        return true;
      }
      return false;
    };

    list.stream().filter(predicate);
  }
}
