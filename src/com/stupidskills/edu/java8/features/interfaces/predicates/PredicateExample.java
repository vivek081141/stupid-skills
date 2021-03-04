/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package com.stupidskills.edu.java8.features.interfaces.predicates;

import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

/**
 * Predicate is a functional interface which
 * implements a single function which returns a boolean
 */
public class PredicateExample {

  public void test01(){
    IPredicate predicate = new IPredicate() {
      @Override
      public boolean test(Object t) {
        return "Hello".equals(t);
      }
    };

    predicate.test("Hello");
  }

  public boolean test(int var) {
    Predicate<Integer> predicate1 = x -> x > 10;
    Predicate<Integer> predicate2 = x -> x < 20;

    Predicate<Integer> predicate3 = x -> predicate1.test(x) && predicate2.test(x);
    return predicate1.and(predicate2).test(var);
  }

  public List<String> removeElement(List<String> list, String element) {

    list.removeIf(new Predicate<String>() {
      @Override
      public boolean test(String s) {
        return false;
      }
    });

    return list;
  }
}

@FunctionalInterface
interface IPredicate {
  boolean test(Object t);

  default IPredicate and(Predicate  other) {
    return (t) -> test(t) && other.test(t);
  }
}