package com.stupidskills.edu.oop.factory;

import com.stupidskills.edu.oop.abstraction.example1.Axis;
import com.stupidskills.edu.oop.abstraction.example1.Bank;
import com.stupidskills.edu.oop.abstraction.example1.SBI;

public class BankFactory {

  public static Bank createObject(String bankType) {
    Bank bank = null;

    if(Bank.AXIS.equalsIgnoreCase(bankType)) {
      bank = new Axis();
    }
    if(Bank.SBI.equalsIgnoreCase(bankType)) {
      bank = new SBI();
    }

    return bank;
  }
}
