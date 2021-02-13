package com.stupidskills.edu.arraylist.create;

import java.util.ArrayList;
import java.util.List;

/** https://javaconceptoftheday.com/java-arraylist-programming-examples/ **/
public class ArrayListInitDemo {



  //way of creating arraylists
  public void create() {
    List<String> list1 = new ArrayList();
    list1.add("Vivek");

    //if we know the size in advance
    List<String> list2 = new ArrayList<String>(100);

    List<String> list3 = new ArrayList<String>(list1);

  }


  public void operation(List<String> list) {
    create();

  }











}
