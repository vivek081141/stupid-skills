package com.stupidskills.edu.oop.abstraction.example1;


/**
 *  SBI: Derived Class, SUB CLASS
 *  BANK: Base Class Super Class
 *
 *  SBI is a Bank
 */
public class SBI extends Bank {

  public SBI() {
    super();
  }

  @Override
  public void sendBalanceNotifications() {
    System.out.println("Sending the balance via sms" + balance);
  }


}
