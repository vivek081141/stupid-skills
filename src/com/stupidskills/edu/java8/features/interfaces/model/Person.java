package com.stupidskills.edu.java8.features.interfaces.model;

public class Person {
  String name;
  String age;

  public Person(String name, String age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person{" + "name='" + name + '\'' + ", age='" + age + '\'' + '}';
  }
}
