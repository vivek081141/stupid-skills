package com.stupidskills.edu.java8.features.interfaces.supplier;

import java.util.function.Supplier;

public class SupplierExample {

  public void test1() {
    ISupplier<String> supplier = new ISupplier<String>() {
      @Override
      public String get() {
        return "Hello World";
      }
    };

    System.out.println(supplier.get());
  }

  public void test2() {
    ISupplier<String> lambdaSup = () -> "hello world";
    System.out.println(lambdaSup.get());
  }

  public void test3() {
    Supplier<String> lambdaSup = () -> "hello world";
    System.out.println(lambdaSup.get());
  }

}


@FunctionalInterface
interface ISupplier<T> {

  public abstract T get();
}
