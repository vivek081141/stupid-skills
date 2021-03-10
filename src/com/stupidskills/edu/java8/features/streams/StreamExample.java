package com.stupidskills.edu.java8.features.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {


  public void filter() {
    List<Product> products = createList();
    Predicate<Product> predicate1 = x-> x.getWeight() < 30;
    Predicate<Product> predicate2 = x-> x.getWeight() > 20;
    Predicate<Product> predicate = predicate1.and(predicate2);

    List<String> list = products.stream()
            .filter(predicate)
            .map( x -> x.getName()) // list<Product> -> List<String>
            .collect(Collectors.toList());

    list.stream().forEach(x-> System.out.println(x));
  }

  /**
   * intermediary operation: peek
   */
  public void peak() {
    List<Product> products = createList();
    products.stream().peek(x-> System.out.println(x.getName())).forEach(x-> System.out.println(x));

  }

  /**
   * List<List<String> to List<String>
   */
  public void flatMap () {
    List<String> sectionA = List.of("A", "B", "C");
    List<String>  sectionB = List.of("X", "Y", "Z");
    List<String> sectionC = List.of("M", "N", "O");



    List<List<String>> sectionList = List.of(sectionA, sectionB, sectionC);

    Function<String, String> function = x -> x + "";
    Function<List<String>, Stream<String>> flatFunction = x -> x.stream();


    List<String> list = sectionList.stream().flatMap( x -> x.stream()).collect(Collectors.toList());


    sectionList.stream()
            .map(x->x.stream())
            .forEach(x -> System.out.println(x));

  }

  /**
   * Reduce - great for addition, product
   */
  public void reduce() {
    Stream<Integer> stream = Stream.of(2, 1, 5);
    BinaryOperator<Integer> biFunction =  (Integer a, Integer b) -> (a + b);
    Integer integer = stream.reduce(10, biFunction );
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


  }

  /**
   * Create a List of products
   * @return
   */
  public List<Product> createList () {
    List<Product> products = new ArrayList<>();
    products.add(new Product("Qualified", 21f));
    products.add(new Product("B", 60f));
    products.add(new Product("C", 70f));
    products.add(new Product("D", 80f));
    return products;

  }
}

