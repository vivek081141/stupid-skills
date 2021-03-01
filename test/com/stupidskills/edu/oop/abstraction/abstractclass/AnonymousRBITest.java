package com.stupidskills.edu.oop.abstraction.abstractclass;

import org.junit.jupiter.api.Test;

/**
 * This is anonymous class implementation of an
 * Abstract Class which is RBI Bank
 *
 */
public class AnonymousRBITest {

  @Test
  public void test() {
    RBIBank impl = new RBIBank() {

      @Override
      public boolean closeAccount() {
        return false;
      }

      @Override
      public void sendBalanceNotifications() {
        System.out.println("Smms is sent to your number  " + balance);
      }


    };

    impl.deposit(1000);
    impl.withdraw(500);
    impl.sendBalanceNotifications();
  }
}