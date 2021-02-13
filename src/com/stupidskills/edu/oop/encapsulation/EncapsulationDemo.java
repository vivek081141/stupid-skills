package com.stupidskills.edu.oop.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class EncapsulationDemo {


  public static void main(String[] args) {
    Employee employee = new Employee("ABCD");

    Address address = new Address();
    address.setCity("bangalore");
    //List<Address> addressList = new ArrayList<Address>();
    //addressList.add(address);

    employee.addAddress(address);


    //employee
  }
}
