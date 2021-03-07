package com.stupidskills.edu.java8.features.ofs;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class MapOfOperatorExample {

  public void test() {
    Map<String, String> map = Map.of("key", "value");

    Set<String> set = Set.of("key1", "key2", "key3");


    List<String> names = List.of("Vivek", "Rakesh");


    Stream<String> stream = Stream.of("A","B", "C" );
  }
}
