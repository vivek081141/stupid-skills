package com.stupidskills.edu.sort.comparator;

import com.stupidskills.edu.sort.comparable.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PlayerTestMatchComparatorTest {

  @Test
  public void test() {
      List<Player> playerList = createPersonList();

    Collections.sort(playerList, new PlayerTestMatchComparator());

    for (Player p : playerList) {
      System.out.println("Name: " + p.getName() + " Test Matches: "+ p.getTestMatches());
    }

  }


  @Test
  public void test2() {
    List<Player> playerList = createPersonList();

    Collections.sort(playerList, new PlayerAverageComparator());

    for (Player p : playerList) {
      System.out.println("Name: " + p.getName() + " Test Matches: "+ p.getTestMatches() + " Runs: " + p.getRuns());
    }

    Assertions.assertEquals(playerList.get(0).getName(), "Shikhar");


    //NS-123213: Defect, we are writing one more test case
    Assertions.assertEquals(playerList.get(1).getName(), "Rohit");
  }

  @Test
  public void test3_anonymous_class() {
    List<Player> playerList = createPersonList();

    Comparator<Player> impl = new Comparator<Player>() {
      @Override
      public int compare(Player o1, Player o2) {
        return o1.getRuns() - o2.getRuns();
      }
    };

    Collections.sort(playerList, impl);

    for (Player p : playerList) {
      System.out.println("Name: " + p.getName() + " Test Matches: "+ p.getTestMatches() + " Runs: " + p.getRuns());
    }

    Assertions.assertEquals(playerList.get(0).getName(), "Shikhar");
    Assertions.assertEquals(playerList.get(1).getName(), "Rohit");
  }


  private List<Player> createPersonList() {
    List<Player> playerList = new ArrayList<>();
    Player virat = new Player("Virat", 87, 7401);
    Player rohit = new Player("Rohit", 35, 2288);
    Player shikharDhawan = new Player("Shikhar", 35, 2088);
    Player sachin = new Player("Sachin", 200, 15921);
    Player pujara = new Player("Pujara", 82, 6199);

    playerList.add(virat);
    playerList.add(rohit);
    playerList.add(shikharDhawan);
    playerList.add(sachin);
    playerList.add(pujara);

    return playerList;
  }
}