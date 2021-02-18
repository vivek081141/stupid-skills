package com.stupidskills.edu.oop.abstraction.abstractclass;


/**
 *  SBI: Derived Class, SUB CLASS
 *  BANK: Base Class Super Class
 *
 *  SBI is a Bank
 */
public class SBI extends RBIBank {

  public SBI() {
    super();
  }

  @Override
  public boolean closeAccount() {
    return false;
  }

  @Override
  public void sendBalanceNotifications() {
    System.out.println("Sending the balance via sms" + balance);
  }


}
