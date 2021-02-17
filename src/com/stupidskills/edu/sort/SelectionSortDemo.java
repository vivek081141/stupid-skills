package com.stupidskills.edu.sort;

public class SelectionSortDemo {

  public  int[] selectionSort(int[] args) {
    //          0    1   2   3   4
    int[] arr = {64, 13, 5, 50, 1};


    // i = 0
    //int[] arr = {11, 25, 12, 22, 64};


    // j = 1 [25], 2[12], 3 [22], 4[11]

    // minimum = 64, 25, 12  11, 13 5  1
    // index = 0, 1,     2   4,  1  2  4

    for (int i=0; i < arr.length -1  ; i++ ) {
      int min_index = i;

      for (int j= i+1 ; j < arr.length ; j++) {
        if (arr[min_index] > arr[j]) {
          min_index = j;
        }
      }

      int temp = arr[i]; //64
      arr[i] = arr[min_index];
      arr[min_index] = temp;

    }

   return arr;
  }
}
