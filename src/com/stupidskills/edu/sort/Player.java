package com.stupidskills.edu.sort;

public class Player  implements Comparable<Player>{
  private String name;
  private int testMatches;
  private int runs;

  public Player(String name,int testMatches, int runs) {
    this.name = name;
    this.testMatches = testMatches;
    this.runs = runs;
  }

  public String getName() {
    return name;
  }

  public float getTestMatches() {
    return testMatches;
  }

  public int getRuns() {
    return runs;
  }

  @Override
  public int compareTo(Player o) {
    return 0;
  }


  /**
   * natural order is increasing
   *
   * Returns:
   *    * a positive integer = if this object is greater than specified object
   *    * a negative integer = if this object is less than specified object
   *    * zero,
   *
   *
   * * return positive if current person_id is greater than specified one
   *
   */

}
