package edu.apcs.project.models;

/**
 *
 * Fish
 * Angel (
 * Gold Fish
 *
 *
 *
 * Technical
 * Functional
 */

/**
 * AngelFish IS-A Fish
 */
public class AngelFish extends Fish {

  public AngelFish(String name, Float size, String color, Float price, String description, int noOfItems) {
    super(name, size, color, price, description, noOfItems);
    this.type = "ANGEL_FISH";
    this.maintenance = 2;
    this.friendly = 3;
  }
}
