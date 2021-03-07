package edu.apcs.project.models;

public class Tetra extends Fish {


  public Tetra(String name, Float size, String color, Float price, String description, int noOfItems) {
    super(name, size, color, price, description, noOfItems);
    this.type = "TETRA";
    this.maintenance = 1;
    this.friendly = 1;
  }
}
