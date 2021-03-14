package edu.apcs.project.models;

public class FightingFish extends Fish {

  public FightingFish(String name, Float size, String color, Float price, String description, int noOfItems) {
    super(name, size, color, price, description, noOfItems);
    this.type = "Fighting Fish";
    this.maintenance = 1;
    this.friendly = 1;
  }
}
