package com.stupidskills.edu.arraylist.exercise1;

import com.stupidskills.edu.Address;
import com.stupidskills.edu.Student;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListInitDemo {

 /* public static void main(String[] args) {
    ArrayListInitDemo demo = new ArrayListInitDemo();
    demo.createListOfStudents();
  }*/

  /**
   * 0 -> 1
   * 1 -> 2
   * 2 -> 5
   * 3 => 4
   * 4 -> 6
   *
   * @param arts
   */
  public static void main(String[] arts)
  {
    List<Integer> list1 = new ArrayList<Integer>();
    list1.add(1);
    list1.add(2);
    list1.add(3);
    list1.set(2, 4);
    list1.add(2, 5); //re-sizing of array
    list1.add(6);
    System.out.println(list1);
  }


  /** 3 ways to create array lists **/
  public void create() {
    String[] arrays = new String[100];
    ArrayList<String> list1 = new ArrayList(); //Object[10]
    list1.size(); //0
    list1.add("Vivek"); //object[0] = "Vivek"
    list1.size(); //1
    list1.get(0);//"Vivek"

    list1.remove(1);

    list1.add(0, "Vivek");


    ArrayList<String> list3 = new ArrayList<String>(list1);

    ArrayList<Student> list = new ArrayList<Student>();



  }

  public void createListOfStudents() {
    ArrayList<Student> list = new ArrayList<>(100);//Object[100]
    Student a = new Student("Vivek", 30);
    Student b = new Student("Aditya", 17);
    list.add(a);
    list.add(b);

    for (Student student: list) {
      System.out.println("Name " + student.getName() + " Age: "+ student.getAge());
    }

    for (int i=0; i< list.size(); i++) {
      Student student = list.get(i);
      System.out.println("Name " + student.getName() + " Age: "+ student.getAge());
    }

    int i = 0;
    while (i< list.size()) {
      Student student = list.get(i);
      System.out.println("Name " + student.getName() + " Age: "+ student.getAge());
      i = i+1; //i++;
    }

    Student newStudent = new Student("XYZ", 100);
    list.set(1, newStudent );

    list.remove(0);
    list.remove(0);
    list.remove(0); //.IndexOutOfBoundsException






    Student[] array = new Student[2];
    array[0] = a;
    array[1] = b;
  }








  public void trim() {
    ArrayList<String> list = new ArrayList<String>(100);
    list.add("ONE");
    list.add("TWO");
    list.add("THREE");
    list.add("FOUR");
    list.trimToSize();
  }

  public void size() {
    ArrayList<String> list = new ArrayList<String>(100);
    list.add("ONE");
    list.add("TWO");
    list.add("THREE");
    list.add("FOUR");
    System.out.println(list.size());
    list.remove(0);
    System.out.println(list.size());
    System.out.println(list.get(0));
  }


  public void isEmpty() {
    ArrayList<String> list = new ArrayList<String>(100);
    list.add("ONE");
    list.add("TWO");
    list.add("THREE");
    list.add("FOUR");
    System.out.println(list.isEmpty()?true:false);
    list.remove(0);
    list.remove(0);
    list.remove(0);
    list.remove(0);
    System.out.println(list.isEmpty()?true:false);
  }

  public void indexOf() {
    ArrayList<String> list = new ArrayList<String>(100);
    list.add("ONE");
    list.add("TWO");
    list.add("THREE");
    list.add("FOUR");
    System.out.println(list.indexOf("ONE"));
  }

  public void iteration() {
    List<String> list = new ArrayList<String>();
    list.add("ONE");
    list.add("TWO");
    list.add("THREE");
    list.add("FOUR");

    for (int i =0 ; i< list.size(); i++) {
      System.out.println(list.get(i));
    }

    //for enchanced loop
    for(String str: list) {
      System.out.println(str);
    }

    //formatedString =  ("ONE" , "TWO" , "THREE" , "FOUR")

    String formatedString = "";
    Iterator<String> itr = list.iterator();
    while(itr.hasNext()) {

      String key = itr.next();
      formatedString = formatedString + key;

      if (itr.hasNext()) {
        formatedString = formatedString + ",";
      }

    }
    System.out.println(formatedString);

    //while

    //do while
  }


  //array to arraylist
  public void toArray() {
    String[] strings = {"ONE", "TWO", "THREE"};
    //List<String> stringList = new ArrayList<>(Arrays.asList(strings));
    List<String> stringList = new ArrayList<>();


    //1st way - converting array to arraylist
    for (int i =0; i< strings.length; i++) {
      String str = strings[i];
      stringList.add(str);
    }

    //2nd way - converting array to arraylist
    List<String> nameList = new ArrayList<>(Arrays.asList(strings));


    //1st way : Arraylist to array
    String[] newArray = new String[stringList.size()];

    for (int i =0; i< stringList.size(); i++) {
      String str = stringList.get(i);
      newArray[i] = str;
    }


    //2nd way: Arraylist to array
    Object[] oldArray = stringList.toArray();
    for (Object obj: oldArray) {
      System.out.println(obj);
    }
  }


  public void xyz() {
    Student x = new Student("X", 15);
    Address firstAddress = new Address();
    firstAddress.setCity("Bangalore");
    firstAddress.setCountry("India");

    Address secondAddress = new Address();
    secondAddress.setCity("Hyderabad");
    secondAddress.setCountry("India");


  }












}
