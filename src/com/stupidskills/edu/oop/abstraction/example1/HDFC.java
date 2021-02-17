package com.stupidskills.edu.oop.abstraction.example1;

public class HDFC extends RBIBank{

  @Override
  public void sendBalanceNotifications() {
    System.out.println("Sending balance");
  }

  @Override
  public boolean closeAccount() {
    return true;
  }
}
