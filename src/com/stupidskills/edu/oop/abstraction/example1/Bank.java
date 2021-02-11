package com.stupidskills.edu.oop.abstraction.example1;

public abstract class Bank {

  public Bank() {
    System.out.println("bank constructor");
  }

  //1000
  protected long balance;

  public void deposit(long deposit) {
    balance = balance + deposit;
  }

  //2000
  public void withdraw(long withdrawAmount) {
    balance = balance - withdrawAmount;
  }

  public abstract void sendBalanceNotifications();

}
