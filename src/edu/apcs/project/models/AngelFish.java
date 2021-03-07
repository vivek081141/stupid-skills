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

  public AngelFish(Float size, String color, Float price, String description, int noOfItems) {



    this.type = "ANGEL_FISH";
    this.maintenance = 2;
    this.friendly = 3;
  }
}
