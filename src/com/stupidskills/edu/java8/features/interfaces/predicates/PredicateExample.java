/*
 * All rights reserved 2020
 * author: vivek081141@gmail.com
 *
 */

package com.stupidskills.edu.java8.features.interfaces.predicates;

import com.stupidskills.edu.java8.features.streams.Product;
import java.util.List;
import java.util.function.Predicate;

/**
 * Predicate is a functional interface which
 * implements a single function which returns a boolean
 */
public class PredicateExample {

  public static void main(String[] args) {
    PredicateExample example = new PredicateExample();
    example.test01();
  }


  public void test01(){
    IPredicate<Product> predicate = (Product product) -> product.getWeight() > 40;
    Product product = new Product("TV", 30f);
    predicate.test(product);
  }



  public boolean test(int var1, int var2) {
    Predicate<Integer> predicate1 = (Integer x) -> {return x > 10 ;};
    Predicate<Integer> predicate2 = x -> x < 20;


    boolean result = predicate1.test(var1) && predicate2.test(var2);


    Predicate<Integer> predicate = predicate1.and(predicate2);
    predicate.test(var1);


    return predicate1.and(predicate2).test(var1);
  }

  public List<String> removeElement(List<String> list, String element) {

    Predicate<String> predicate = x -> x.equals(element);

    boolean isRemoved = list.removeIf(predicate);


    return list;
  }
}

@FunctionalInterface
interface IPredicate<Product> {

 public abstract boolean test(Product t);

  default IPredicate and(Predicate  other) {
    return (t) -> test((Product) t) && other.test(t);
  }
}