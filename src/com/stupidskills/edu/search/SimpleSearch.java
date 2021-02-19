package com.stupidskills.edu.search;

public class SimpleSearch {

  public int search(int[] array, int x) {

    //worst case complexity: O(n)
    for ( int i=0; i< array.length; i++) {
       if (array[i] == x) {
         return i;
       }
    }

    return -1;
  }

}
