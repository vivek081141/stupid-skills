package com.stupidskills.edu.search;

public class SimpleSearch {

  public static void main(String[] args) {
    int[] array = { 10, 9, 8 , 5, 100}; //1M for worst case

    //2
    boolean flag = false;
    int x = 5;

    for ( int i=0; i< array.length; i++) {
        if (array[i] == x) {
          flag = true;
          System.out.println(" Value is present and the index is " + i);
          break;
        }
    }

    if (flag == false) {
      System.out.println(" Value is not present");
    }

  }

}
