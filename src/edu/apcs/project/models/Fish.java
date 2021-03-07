package edu.apcs.project.models;



public class Fish {

  protected int maintenance;
  protected int friendly;
  protected String type;

  protected double size;
  protected double price;
  protected String color;
  protected String description;

  //no of items
  protected Integer noOfItems;

  public Fish() {
  }

  public Fish(double size, String color, double price, String description, int noOfItems) {
    this.size = size;
    this.color = color;
    this.price = price;
    this.description = description;
    this.noOfItems = noOfItems;
  }


  public String getType() {
    return type;
  }

  public Integer getMaintenance() {
    return maintenance;
  }

  public Integer getFriendly() {
    return friendly;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  public double getSize() {
    return size;
  }

  public void setSize(Float size) {
    this.size = size;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Integer getNoOfItems() {
    return noOfItems;
  }

  public void setNoOfItems(Integer noOfItems) {
    this.noOfItems = noOfItems;
  }

  @Override
  public String toString() {
    return "Fish{" + "maintenance=" + maintenance + ", friendly=" + friendly + ", size=" + size + ", price=" + price + ", color='" + color + '\'' + ", description='" + description + '\'' + '}';
  }
}
