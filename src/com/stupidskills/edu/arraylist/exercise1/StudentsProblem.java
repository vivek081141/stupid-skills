package com.stupidskills.edu.arraylist.exercise1;

import com.stupidskills.edu.Address;
import com.stupidskills.edu.Student;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentsProblem {


  /**
   * Every student can have multiple address
   * eg: 1 student will have 3 address
   *
   * Question: Find unique city among all those addresses?
   *
   */

  public static void main(String[] args) {
    StudentsProblem studentsProblem = new StudentsProblem();
    studentsProblem.test();
  }
  public void test() {

    List<Student> studentList = new ArrayList<>();
    Student student1 = new Student("X", 28);
    student1.setAddressList(addressOfStudent1());

    Student student2 = new Student("Y", 30);
    student2.setAddressList(addressOfStudent2());

    studentList.add(student1);
    studentList.add(student2);

    List<String> uniqueCity = findUniqueCity(studentList);
    System.out.println(uniqueCity);
  }

  public List<String> findUniqueCity(List<Student> studentList) {
    //List<String> uniqueCity = new ArrayList<>();
    Set<String> hashSet = new HashSet<>();
    for (Student student: studentList) {
      //student -> 1st student which is present in the arraylist
      for(Address address: student.getAddressList()) {
        //address -> 1st address, 2nd, 3rd
        /*if (!uniqueCity.contains(address.getCity())) {
          uniqueCity.add(address.getCity());
        }*/
        hashSet.add(address.getCity());
      }
    }

    //Object[]
    List<String> uniqueCity = new ArrayList<String>(hashSet);
    return uniqueCity;
  }

  private List<Address> addressOfStudent1() {
    List<Address> addressList = new ArrayList<>();
    Address tempAddress = new Address("Bangalore", "India", "560049");
    Address permAddress = new Address("Hyd", "India", "660041");
    Address foreignAdd = new Address("Singapore", "USA", "360081");
    addressList.add(tempAddress);
    addressList.add(permAddress);
    addressList.add(foreignAdd);
    return addressList;
  }

  private List<Address> addressOfStudent2() {
    List<Address> addressList = new ArrayList<>();
    Address tempAddress = new Address("Alabama", "USA", "560049");
    Address permAddress = new Address("Bangalore", "India", "660041");
    Address foreignAdd = new Address("Singapore", "Singapore", "360081");
    addressList.add(tempAddress);
    addressList.add(permAddress);
    addressList.add(foreignAdd);
    return addressList;
  }
}
