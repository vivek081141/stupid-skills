package edu.apcs.project.models;

public class GoldFish extends Fish {


  public GoldFish(String name,double size, String color, double price, String description, int noOfItems) {
    //70% of parent
    super(name, size, color, price, description, noOfItems);
    //30% of our own
    this.type = "GOLD_FISH";
    this.maintenance = 5;
    this.friendly = 5;
  }



}
