package com.stupidskills.edu;


import com.stupidskills.edu.strings.ImmutableDemo;
import java.util.*;

/**
 *
 * Class - public class com.stupidskills.edu.HelloWorld
 *
 * Entrypoint of this class
 * Function: main
 */

public class HelloWorld {

  /*
  1. What is Class + main method
  2. Main Method
  3. Build
  4. Run
   */

  /**
   * public : it can be accessed from anywhere
   * static: com.stupidskills.edu.HelloWorld.main *complicate
   * This method is static
   *
   * void: this method/function is not returning anything
   * main: Method Name
   *
   * String[] args: Passing Parameter
   *        0         1         2       3
   * args = [string1, string2, string3, string4 ]
   */
  public static void main(String[] args) {
    ImmutableDemo demo = new ImmutableDemo();
    ArrayList list = new ArrayList();
    System.out.println(args[0]) ;//println

    String s = "Hello";
  }

  public String withoutX2(String str) {

    if (str.length() < 2) {
      return str;
    }

    boolean flag = false;
    if (str.charAt(0) == 'x' || str.charAt(1)== 'x') {
      flag = true;
    }

    if (flag) {
      String temp = "";
      for (int i=0; i<str.length(); i++) {
        if (str.charAt(i) != 'x') {
          temp = temp +  str.charAt(i);
        }
      }
      str = temp;
    }

    return str;

  }



}
