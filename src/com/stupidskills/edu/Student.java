package com.stupidskills.edu;

import java.util.List;

/**
 * Blueprint
 */
public class Student {
  // member variable
  String name; //null
  int age; // 0
  private List<Address> addressList;

  //firstName = Anil
  //ageOfStudent = 28
  public Student(String firstName, int ageOfStudent) {
    name = firstName;
    age = ageOfStudent;
  }

  public List<Address> getAddressList() {
    return addressList;
  }

  public void setAddressList(List<Address> addressList) {
    this.addressList = addressList;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
}
