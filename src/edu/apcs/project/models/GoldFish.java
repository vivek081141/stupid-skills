package edu.apcs.project.models;

public class GoldFish extends Fish {


  public GoldFish(double size, String color, double price, String description, int noOfItems) {
    //70% of parent
    super(size, color, price, description, noOfItems);

    this.size = size;
    this.color = color;
    this.price = price;
    this.description = description;
    this.noOfItems = noOfItems;

    //30% of our own
    this.type = "GOLD_FISH";
    this.maintenance = 5;
    this.friendly = 5;
  }


  @Override
  public String toString() {
    return "GoldFish{" + "maintenance=" + maintenance + ", friendly=" + friendly + ", size=" + size + ", price=" + price + ", color='" + color + '\'' + ", description='" + description + '\'' + ", type='" + type + '\'' + '}';
  }
}
