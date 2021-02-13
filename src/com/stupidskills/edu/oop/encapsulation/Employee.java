package com.stupidskills.edu.oop.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class Employee {
  private String name ;
  private List<Address> addressList;

  public Employee(String name) {
    this.name = name;
  }


  /*public String getName() {
    return name;
  }*/

  /*public void setName(String name) {
    this.name = name;
  }*/

  public List<Address> getAddressList() {
    return addressList;
  }

  public void addAddress(Address address) {
    if (addressList == null) {
      addressList = new ArrayList<>();
    }
    this.addressList.add(address);
  }

  public void setAddressList(List<Address> addressList) {
    if (addressList == null) {
      addressList = new ArrayList<>();
    }
    this.addressList = addressList;
  }
}
