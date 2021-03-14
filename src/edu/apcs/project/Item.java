package edu.apcs.project;

import edu.apcs.project.models.Fish;

/**
 * This will contain Fish and no of fishes a user is going to purchase
 */
public class Item {
  //11 + 25
  private Fish fish;
  private Integer number;

  public Item(Fish fish, Integer number) {
    this.fish = fish;
    this.number = number;
  }

  public Fish getFish() {
    return fish;
  }

  public Integer getNumber() {
    return number;
  }

  @Override
  public String toString() {
    return "Order{" + "fish=" + fish + ", number=" + number + '}';
  }
}
