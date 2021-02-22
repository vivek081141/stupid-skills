package com.stupidskills.edu.exception.exercise1;

import com.stupidskills.edu.sort.comparable.Player;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Runtime Exception
 */
public final class UnCheckedException {

  public Integer arithmeticTest(int a, int b) {
    if (b == 0) {
      return Integer.MAX_VALUE;
    }
    return a / b;
  }

  public int nullPointerTest(String str) {
    if (str == null) {
      return 0;
    }
    System.out.println(str.length());  // null -> null.length()
    return str.length();
  }

  public Player classCastException(Object object) {
    Player player = null;
    if (object instanceof Player) {
      player = (Player) object;
    }
    return player;
  }

  public int arrayIndexOutOfBoundException( Integer[] array) {
    System.out.println("arrayIndexOutOfBoundException::started::");

    try {

      //open a connection
      //create a PS
      //insert a record

      //update a record
      System.out.println(array[4]); //null[4]
      return 0;  //this will not get executed
    }catch (ArrayIndexOutOfBoundsException | NullPointerException ex){
      ex.printStackTrace();
      return -1; //return -1
    } catch (Exception ex) {
      System.out.println("Null Pointer has occured");
    }
    finally{
      return 1; //return 1
    }

    /*List<Integer> arrayList = new ArrayList<>(Arrays.asList(array));
    if (array != null && arrayList.size() > 4) {
      System.out.println(array[4]);
    }*/
  }

  public static void main(String[] args) {
    try {
      throwExample(-1);
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }finally {

    }
  }

  //capture Checked Exceptions
  public static void throwExample(int x) throws ClassNotFoundException {
    ClassNotFoundException exception = new ClassNotFoundException("x should be greater then 0");

    if (x < 0) {
      throw exception;
    }

  }

  public boolean testFinalize() {
    Player rohit = new Player("Rohit", 87, 7401);
    System.out.println(rohit.toString());
    return true;
  }


  public boolean dummyMethod() {
    System.out.println("Dummy Method");
    System.gc();
    System.out.println("GC called Method");
    return true;
  }
}
