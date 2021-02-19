package com.stupidskills.edu.search;

public class BinarySearch {

  public  int binarySearch(int[] array,int l, int r, int x ) {
    int mid = (l+r)/2; //3

    // case1: success
    if (array[mid] == x) {
      return mid;
    }

    //termination
    if (l > r) {
        return -1;
    }

    //case2: x is greater than mid
    // ignoring the left half of array
    if (array[mid] < x) {
        l = mid + 1;
        return binarySearch(array, l, r, x);
    }


    //case3: x is lesser than mid
    //ignoring the right side of array
    if (array[mid] > x) {
      r = mid - 1;
      return  binarySearch(array, l, r, x);
    }

    //non executable code
    return -1;
  }


  public  int binarySearch2(int[] array,int l, int r, int x ) {
    //3

    //termination
    while (r > l) {

      int mid = (l+r)/2;
      // case1: success
      if (array[mid] == x) {
        return mid;
      }

      //case2: x is greater than mid
      // ignoring the left half of array
      if (array[mid] < x) {
        l = mid + 1;
      }

      //case3: x is lesser than mid
      //ignoring the right side of array
      if (array[mid] > x) {
        r = mid - 1;
      }
    }
    //non executable code
    return -1;
  }
}
