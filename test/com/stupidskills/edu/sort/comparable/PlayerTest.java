package com.stupidskills.edu.sort.comparable;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * For a list of players, we want to sort them on the the basic of runs
 * Order : Ascending Order
 */
public class PlayerTest {

  @Test
  public void test1() {
    List<Player> playerList = createPersonList();

    Collections.sort(playerList);

    for (Player p : playerList) {
      System.out.println("Name: " + p.getName() + " Runs: "+ p.getRuns());
    }
  }

  //{1, 4, 6, 8, 5} = {1, 4, 5, 6, 8 }
  private List<Player> createPersonList() {
    List<Player> personList = new ArrayList<>();
    Player virat = new Player("Virat", 87, 7401);
    Player rohit = new Player("Rohit", 35, 2288);
    Player sachin = new Player("Sachin", 200, 15921);
    Player pujara = new Player("Pujara", 82, 6199);

    personList.add(virat);
    personList.add(rohit);
    personList.add(sachin);
    personList.add(pujara);

    return personList;
  }

}