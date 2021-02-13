package com.stupidskills.edu.oop.abstraction.example1;

public class Axis extends RBIBank{

  public Axis() {
    super(); //this gets added by default
    System.out.println("Axis bank constructor");
  }

  @Override
  public boolean closeAccount() {
    return false;
  }

  @Override
  public void withdraw(long withdrawAmount) {
    balance = balance - withdrawAmount;
  }


  @Override
  public void sendBalanceNotifications() {
    System.out.println("Sending the balance via email" + balance);
  }
}
