package com.stupidskills.edu.java8.features.ofs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;


/**
 * OF operator
 */
public class MapOfOperatorExample {

  public void test() {

    List<String> names = List.of( "two","three", "four");

    Map<String, String> map = Map.of("key", "value");

    Set<String> set = Set.of("key1", "key2", "key3");

    /**
     *  list - > stream1 -> stream2 -> stream3  -> collect.list
     *  operations : intermediatery
     */
    Optional<String> optional = names.stream().filter(x -> x.equals("one")).findFirst();

    //I can have the values or I may not have the values, optional is not null


    Stream<String> stream = Stream.of("A","B", "C" );
  }
}
