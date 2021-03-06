package com.stupidskills.edu.oop.factory;

import com.stupidskills.edu.oop.abstraction.abstractclass.Bank;
import com.stupidskills.edu.oop.encapsulation.Employee;

public class FactoryDemo {


  public static void main(String[] args) {

    Employee emp = new Employee("Vivek");
    Bank axis = BankFactory.createObject(BankName.AXIS);
    Bank sbi = BankFactory.createObject(BankName.SBI);

    depositMoney(emp,axis, 500);
    depositMoney(emp,sbi, 500);
  }


  private static void depositMoney(Employee emp, Bank axis, int money) {
    axis.deposit(money);
  }


}
