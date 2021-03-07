package com.stupidskills.edu.java8.features.interfaces.supplier;

import java.util.function.Supplier;

public class SupplierExample {

  public void test1() {
    //anonymous class
    ISupplier<String> supplier = new ISupplier<String>() {
      @Override
      public String get() {
        return "Supplier is getting implemented";
      }
    };

    System.out.println(supplier.get());
  }

  public void test2() {
    ISupplier<String> lambdaSup = () -> "Supplier is getting implemented";
    System.out.println(lambdaSup.get());

    test3(() -> "Supplier is getting implemented");
  }

  public void test3(ISupplier<String> lambdaSup) {
    lambdaSup.get();
  }


  public ISupplier<String> test4() {
    return () -> "Supplier is getting implemented";
  }
}


@FunctionalInterface
interface ISupplier<T> {

  public abstract T get();

  default void print(String x){
    System.out.println(x);
  }
}
