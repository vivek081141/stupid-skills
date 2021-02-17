package com.stupidskills.edu.maps.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

  public Map<Integer, String> createMap() {
    Map<Integer, String> hashmap = new HashMap<Integer, String>();

    // Add Elements using put method
    hashmap.put(1, "one");
    hashmap.put(2, "two");
    hashmap.put(3, "three");

    hashmap.put(4, "four");
    hashmap.put(5, "five");
    hashmap.put(6, "six");
    hashmap.put(6, "SIX"); //override
    hashmap.put(null, "six"); //one NULL
    hashmap.put(7, "null"); //
    hashmap.put(8, "null"); //
    return hashmap;
  }

  public Map<Integer, String> putMap() {
    Map<Integer, String> hashmap = new HashMap<Integer, String>();
    hashmap.put(1, "one");

    Map<Integer, String> newHashMap = new HashMap<Integer, String>();

    newHashMap.putAll(hashmap);
    return newHashMap;
  }


  public Map<Integer, String> removeMap() {
    Map<Integer, String> hashmap = new HashMap<Integer, String>();
    hashmap.put(1, "one");
    hashmap.remove(1);
    return hashmap;
  }


}
