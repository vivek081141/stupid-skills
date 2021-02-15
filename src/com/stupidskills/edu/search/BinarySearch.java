package com.stupidskills.edu.search;

public class BinarySearch {

  public static void main(String[] args) {
    int[] arrays = { 2, 8, 10, 16, 20, 24, 84}; //0,6

    int x = 35; //element we want to search

    int l = 0;
    int r = arrays.length -1;

    int flag = binarySearch(arrays, l, r, x);

    if (flag == -1) {
      System.out.println("There are no elements in this array");
    }

  }

  /**
   * 1st iteration
   * l = 0
   * r = 6
   * mid = 3
   *
   * 2nd Iteration
   * array: 20, 24, 84
   * l = mid + 1 = 4
   * r = 6
   * m = 5
   *
   * 3rd Iteration
   * l = 5 + 1 = 6
   * r = 6
   * m = 6
   * array: 84
   *
   */
  public static int binarySearch(int[] array,int l, int r, int x ) {
    int mid = (l+r)/2;

    // 84 == 35
    if (array[mid] == x) {
      return mid;
    }

    if (l > r) {
      return -1;
      //then exit
    }

    // 24 > 35
    if (array[mid] > x) {
      l = mid - 1;
      return binarySearch(array, l, r, x);
    }

    // 24 < 35
    if (array[mid] < x) {
      l = mid + 1; // 4
      return binarySearch(array, l, r, x);
    }



    return -1;
  }
}
