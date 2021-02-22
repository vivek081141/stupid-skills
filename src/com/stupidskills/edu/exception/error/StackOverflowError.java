package com.stupidskills.edu.exception.error;

public class StackOverflowError {
//19840
  /**
   * Heap memory: Student student = new Student ("Name", address, communication details) - 250 MB
   * Stack Memory: main -> print(0) -> print(4) -> print(8) ->
   */
  static int i = 0;
  public static int printNumber(int x)
  {

    i = i + 2;
    System.out.println(i);

   /* if (i > 8) {
      return i;
    }*/


    return i + printNumber(i + 2);
  }

  public static void main(String[] args)
  {
    int result = printNumber(i);
    System.out.println("Program ran successfully.");
  }
}
