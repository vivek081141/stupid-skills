package com.stupidskills.edu.java8.features.optionals;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalExample {

  /**
   *
   *  public Optional<List<Address>> getAddress (String userId)
   */

  public void test() {
    Optional<String> optional = Optional.of("One");
    //optional of String ->
    // best case scenario: it will contain a string

    //to check if values are present
    optional.isPresent();

    //skip the is present check
    optional.ifPresent( x -> System.out.println(x));


    //if optional is empty
    Optional<String> optional1 = Optional.empty();
    optional1.ifPresent(x -> System.out.println(x));
  }

  public void test2() {
    Stream<Integer> stream = Stream.of(1,2,3,4,5);
    Optional<Integer> optional = stream.filter( x -> x > 20).findFirst();
    optional.ifPresent(s -> System.out.println(s));

  }
}
