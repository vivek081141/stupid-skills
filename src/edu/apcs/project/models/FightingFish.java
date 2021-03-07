package edu.apcs.project.models;

public class FightingFish extends Fish {

  public FightingFish(Float size, String color, Float price, String description, int noOfItems) {
    this.size = size;
    this.color = color;
    this.price = price;
    this.description = description;
    this.noOfItems = noOfItems;

    this.type = "FIGHTING_FISH";
    this.maintenance = 1;
    this.friendly = 1;
  }
}
