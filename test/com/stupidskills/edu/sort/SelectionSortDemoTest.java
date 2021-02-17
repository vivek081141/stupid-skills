package com.stupidskills.edu.sort;

import org.junit.jupiter.api.Test;

public class SelectionSortDemoTest {

  SelectionSortDemo demo = new SelectionSortDemo();

  @Test
  public void sort() {

    int[] arr = {64, 13, 5, 50, 1};
    int[] sortedArr = demo.selectionSort(arr);

    for (int val: sortedArr) {
      System.out.println(val);
    }
  }

}