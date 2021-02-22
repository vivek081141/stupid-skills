package com.stupidskills.edu.sort.comparable;

public class Player  implements Comparable<Player>{
  private String name;
  private int testMatches;
  private Integer runs;

  public Player(String name,int testMatches, Integer runs) {
    this.name = name;
    this.testMatches = testMatches;
    this.runs = runs;
  }

  public void setRuns(Integer runs) {
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

  @Override
  protected void finalize() throws Throwable {
    //this will be called by JVM whenever it will free the memory of any object associated with this blueprint
    System.out.println("Finalize block::" + this.name);
    super.finalize();
  }

  @Override
  public int hashCode() {
    return 53;
  }

  @Override
  public boolean equals(Object o) {
    /*super.equals(o);*/
    if (this == o) return true;

    Player p = (Player) o;
    return (this.runs.equals(p.runs) ) && (this.testMatches == p.testMatches) && (this.getName().equals(p.getName()));
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
