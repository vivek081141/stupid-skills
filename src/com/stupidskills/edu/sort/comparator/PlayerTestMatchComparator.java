package com.stupidskills.edu.sort.comparator;

import com.stupidskills.edu.sort.comparable.Player;
import java.util.Comparator;

public class PlayerTestMatchComparator implements Comparator<Player> {


  /**
   * Ascending order of test matches
   *
   * @param player1 - run NULL
   * @param player2 - run 100
   * @return
   */
  @Override
  public int compare(Player player1, Player player2) {
      return  (player1.getTestMatches() - player2.getTestMatches());
  }
}
