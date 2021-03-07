package com.stupidskills.edu.java8.features.interfaces.function;

import com.stupidskills.edu.java8.features.streams.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

interface IFunction {

  public String apply (Product product);
}

public class FunctionExample {


  /**
   *  Product to String
   *  Person -> Names (Mapping)
   * @param product
   */
  public void test(Product product) {
    IFunction function = new IFunction() {
      @Override
      public String apply(Product product) {
        return product.getName();
      }
    };

    IFunction function1 = (Product p) -> p.getName();

    System.out.println(function1.apply(product));
  }

  public void test2() {
    Function<Product, String> functionMapper =  (Product p) -> p.getName();

    List<Product> products = new ArrayList<>();

    products.stream().map((Product p) -> p.getName());
  }

}
