package com.stupidskills.edu.designpattern.builder;

public class MenuBuilderDemo {
  public static void main(String[] args) {


    BankAccount account = new BankAccount(
            "1234567", "Vivek", "8951152580", "");


    processAccount(account);

    account.getBankAccountNumber();

   BankAccount.BankBuilder staticClassInstance = new BankAccount.BankBuilder();




  }

  private static void processAccount(BankAccount account) {

  }
}
