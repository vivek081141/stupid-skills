package com.stupidskills.project.model;

import java.util.List;

public class Customer {

  private String id;
  private String name;
  private Integer age;
  private String mail;
  private String mobile;

  List<Address> addresses;
  private String password;

  public Customer(String id, String name, Integer age, String mail, String mobile, String password, List<Address> addresses) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.mail = mail;
    this.mobile = mobile;
    this.addresses = addresses;
    this.password = password;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public List<Address> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
