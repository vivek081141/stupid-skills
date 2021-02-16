package com.stupidskills.edu.sort.comparator;

import com.stupidskills.edu.sort.Player;
import java.util.Comparator;


public class PlayerAverageComparator implements Comparator<Player> {


  @Override
  public int compare(Player player1, Player player2) {

    if (player1.getTestMatches() > player2.getTestMatches()) {
      return 1;
    }
    if (player1.getTestMatches() < player2.getTestMatches()) {
      return -1;
    }
    if (player1.getTestMatches() == player2.getTestMatches()) {
      return player1.getRuns() - player2.getRuns();
    }

    //this line should never get executed
    return 0;
  }
}
