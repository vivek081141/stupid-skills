package com.stupidskills.edu.search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleSearchTest {

  SimpleSearch simpleSearch = new SimpleSearch();

  @Test
  public void search() {
    int[] array = {10, 20, 40 , 50, 25};
    int index = simpleSearch.search(array, 40);
    Assertions.assertEquals(2, index);


    index = simpleSearch.search(array, 25);
    Assertions.assertEquals(4, index);

    index = simpleSearch.search(array, 100);
    Assertions.assertEquals(-1, index);

  }
}