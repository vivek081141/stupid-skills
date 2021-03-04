package com.stupidskills.edu.designpattern.builder;

public class MenuBuilderDemo {
  public static void main(String[] args) {
   /* BankAccount.createObject();

    BankAccount account = new BankAccount();*/
    BankAccount.BankBuilder bankBuilder = new BankAccount.BankBuilder();

    //inner@510
    bankBuilder.addBankAccountNumber("123456")
            .addPrimaryAccountName("Vivek")
            .addEmailAddress("emailAddress")
            .addMobile("8951152580");

    BankAccount account = bankBuilder.builder();

    processAccount(account);

    account.getBankAccountNumber();


    //we have not used instance of bankAccount class


  }

  /**
   * account is immutable
   *
   * @param account
   */
  private static void processAccount(BankAccount account) {

  }
}
