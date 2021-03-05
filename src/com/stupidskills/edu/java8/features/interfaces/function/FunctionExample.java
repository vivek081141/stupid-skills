package com.stupidskills.edu.java8.features.interfaces.function;

import com.stupidskills.edu.java8.features.products.Product;
import java.util.ArrayList;
import java.util.List;

interface IFunction {

  public String apply (Product product);
}

public class FunctionExample {


  public void test() {
    Product product = new Product("AC", 35f);
    IFunction function = (Product p) -> p.getName();

    System.out.println(function.apply(product));
  }

  public void test2() {
    List<Product> products = new ArrayList<>();
    products.stream().map((Product p) -> p.getName());
  }

}
