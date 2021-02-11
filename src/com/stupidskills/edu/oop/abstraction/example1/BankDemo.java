package com.stupidskills.edu.oop.abstraction.example1;

public class BankDemo {

  public static void main(String[] args) {
    Axis axis = new Axis();
    SBI sbi = new SBI();

    axis.deposit(5000);
    withdrawMoney(axis);
    withdrawMoney(sbi);

    withdrawMoney(axis, 1000);
    withdrawMoney(sbi, 500);
  }


  private static void withdrawMoney(Bank bank) {
    bank.withdraw(1000);
    bank.sendBalanceNotifications();
  }

  private static void withdrawMoney(Bank bank, long money) {
    bank.withdraw(money);
    bank.sendBalanceNotifications();
  }
}
