package com.stupidskills.edu.oop.factory;

import com.stupidskills.edu.oop.abstraction.example1.Axis;
import com.stupidskills.edu.oop.abstraction.example1.Bank;
import com.stupidskills.edu.oop.abstraction.example1.HDFC;
import com.stupidskills.edu.oop.abstraction.example1.SBI;

public class BankFactory {

  public static Bank createObject(BankName bankName) {
    Bank bank = null;

    switch ( bankName ) {
      case AXIS:
        bank = new Axis();
        break;
      case HDFC:
        bank = new HDFC();
        break;
      case SBI:
        bank = new SBI();
        break;
      default:
        System.out.println("Default is null");
    }

   /* if(BankName.AXIS == bankName) {
      bank = new Axis();
    }
    if(BankName.SBI == bankName) {
      bank = new SBI();
    }
    if (BankName.HDFC == bankName) {
      bank = new HDFC();
    }*/

    return bank;
  }
}
