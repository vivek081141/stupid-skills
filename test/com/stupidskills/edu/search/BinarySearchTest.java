package com.stupidskills.edu.search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {

  BinarySearch binarySearch = new BinarySearch();

  @Test
  public void binarySearch() {
    int[] arrays = {2, 5, 8, 12, 16, 23, 38};

    int x = 38; //element we want to search
    int l = 0;
    int r = arrays.length - 1; //6
    int index = binarySearch.binarySearch(arrays, l, r, x);

    Assertions.assertEquals(6, index);

    x = 17; //element we want to search
    index = binarySearch.binarySearch(arrays, l, r, x);
    Assertions.assertEquals(-1, index);

  }


}