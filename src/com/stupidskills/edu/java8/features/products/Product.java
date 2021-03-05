package com.stupidskills.edu.java8.features.products;

public class Product {
  private String name;
  private Float weight;

  public Product(String name, Float weight) {
    this.name = name;
    this.weight = weight;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Float getWeight() {
    return weight;
  }

  public void setWeight(Float weight) {
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "Product{" + "name='" + name + '\'' + ", weight=" + weight + '}';
  }
}
