package com.stupidskills.edu.java8.features.products;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ProductExample {


  public void test() {
    List<Product> products = new ArrayList<>();
    products.add(new Product("A", 50f));
    products.add(new Product("B", 60f));
    products.add(new Product("C", 70f));
    products.add(new Product("D", 80f));
  }

  public void sortAndRemove(List<Product> products) {
    List<Product> productList = new ArrayList<>();
    for (Product product : products) {
      if (product.getWeight() > 60) {
        productList.add(product);
      }
    }

    Collections.sort(productList, (p1, p2) -> p1.getWeight().compareTo(p2.getWeight()));

    productList.forEach((product -> System.out.println(product.getName())));
  }

  public void solveRemove(List<Product> products) {
    Function<Product, String> function = (Product p) -> {
      return p.getName();
    };


    products.stream().filter((Product x) -> x.getWeight() > 60).sorted(Comparator.comparing(Product::getWeight)
    ).map(function).forEach((String x) -> System.out.println(x));

    products.stream().filter((Product x) -> x.getWeight() > 60).sorted((Product p1, Product p2) -> {
      return p1.getWeight().compareTo(p2.getWeight());
    }).map(function).collect(Collectors.toList());


    //if all the products matches this Predicate
    products.stream().allMatch((p) -> p.getWeight() > 30);

    products.stream().skip(1).limit(20);

  }

  public void test1 () {
    List<? extends Number> foo = new ArrayList<Number>();  // Number "extends" Number (in this context)
    List<? super Number> list = new ArrayList<Number>();  // Number "extends" Number (in this context)


  }
}
