package com.stupidskills.edu.maps.hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

  public static void main(String[] args) {
    HashSetExample example = new HashSetExample();
    example.create();
  }

  public void create() {
    Set<String> hashSet = new HashSet<>();
    hashSet.add("A");
    hashSet.add("X");
    hashSet.add("E");
    hashSet.add("Z");
    hashSet.add("U");
    hashSet.add("B");
    hashSet.add("C");
    hashSet.add("C");

    HashMap<String, String> map = new HashMap<String, String>();
    map.put("A", "Description of A");
    map.put("A", "Description of new A");

    //hashcode = 17
    //

    System.out.println(hashSet);
  }
}
