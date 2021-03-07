package edu.apcs.project.models;

public class Tetra extends Fish {


  public Tetra(Float size, String color, Float price, String description, int noOfItems) {
    super(size, color, price, description, noOfItems);
    this.type = "TETRA";
    this.maintenance = 1;
    this.friendly = 1;
  }
}
