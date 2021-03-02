package com.stupidskills.edu.designpattern.builder;

/**
 * Builder Design Pattern
 * Immutability
 *
 */
public class BankAccount {

  public void createObject() {
    BankAccount account = new BankAccount();
  }

  //20-30 fields
  private String bankAccountNumber;
  private String primaryAccountHolder;
  private String mobile;
  private String email;


  public String getBankAccountNumber() {
    return bankAccountNumber;
  }


  public String getPrimaryAccountHolder() {
    return primaryAccountHolder;
  }


  public String getMobile() {
    return mobile;
  }


  public String getEmail() {
    return email;
  }

  private BankAccount() {
  }

 /* public BankAccount(String bankAccountNumber) {
    this.bankAccountNumber = bankAccountNumber;
  }

  public BankAccount(String bankAccountNumber, String primaryAccountHolder, String mobile, String email) {
    this.bankAccountNumber = bankAccountNumber;
    this.primaryAccountHolder = primaryAccountHolder;
    this.mobile = mobile;
    this.email = email;
  }*/

  /**
   * static inner class
   */
  public static class BankBuilder {

    public void print() {

      BankAccount account = new BankAccount();


    }

  }



}
