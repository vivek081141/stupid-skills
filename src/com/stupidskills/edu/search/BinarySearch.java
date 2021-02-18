package com.stupidskills.edu.search;

public class BinarySearch {

  public static void main(String[] args) {
    int[] arrays = { 2, 5, 8, 12, 16, 23, 38};

    int x = 35; //element we want to search

    int l = 0;
    int r = arrays.length -1;

    int flag = binarySearch(arrays, l, r, x);

    if (flag == -1) {
      System.out.println("There are no elements in this array");
    }

  }


  public static int binarySearch(int[] array,int l, int r, int x ) {
    int mid = (l+r)/2;

    if (array[mid] == x) {
    }

    if (l > r) {
    }

    if (array[mid] > x) {

    }


    if (array[mid] < x) {

    }



    return -1;
  }
}
