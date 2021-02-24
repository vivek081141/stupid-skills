package com.stupidskills.edu;

import org.junit.jupiter.api.Test;
import java.util.List;

/**
 * Blueprint
 */
@Deprecated
public class Student implements AutoCloseable {
  // member variable

  private String name; //null
  private int age; // 0
  private List<Address> addressList;

  public Student() {
  }

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

  private void printName() {
    System.out.println("Printing name::" + this.name);
  }

  @Override
  public void close() throws Exception {
    System.out.println("Closing connection");
  }
}
