package com.stupidskills.edu.sort;

public class Player  implements Comparable<Player>{
  private String name;
  private int testMatches;
  private Integer runs;

  public Player(String name,int testMatches, Integer runs) {
    this.name = name;
    this.testMatches = testMatches;
    this.runs = runs;
  }

  public String getName() {
    return this.name;
  }

  public int getTestMatches() {
    return testMatches;
  }

  public Integer getRuns() {
    return runs;
  }

  @Override
  public int compareTo(Player o) {
    if (this.runs < o.runs) {
      return 1;
    }
    if (this.runs > o.runs) {
      return -1;
    }
    return 0;


   // return this.runs - o.runs;
  }

  @Override
  public String toString() {
    return "Player{" + "name='" + this.name + '\'' + ", testMatches=" + this.testMatches + ", runs=" + this.runs + '}';
  }


  /**
   *
   * player1 -> Rohit (2200) abcd@509
   * player2 -> Virat (8700) abcd@511
   *
   *  player1.compareTo(player2)
   */

  /**
   * natural order is ascending
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
