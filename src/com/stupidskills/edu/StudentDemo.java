package com.stupidskills.edu;

public class StudentDemo {


  /**
   * whats the value of studentA? - L12
   * studentA.name = before 14
   * @param args
   */
  public static void main(String[] args) {

    //creating an object of com.stupidskills.edu.Student
    Student studentA = new Student("Anil", 28);

   /* studentA.name = "Anil";
    studentA.age = 20;*/

    Student studentB = new Student("B", 20);
   /* studentB.name = "B";
    studentB.age = 20;*/

    System.out.println(studentA.getName());
    System.out.println(studentB.getName());
  }

}
