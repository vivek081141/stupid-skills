package com.stupidskills.edu.designpattern.builder;

/**
 * Builder Design Pattern
 * Immutability
 *
 */
public class BankAccount {


  //20-30 fields
  private String bankAccountNumber;
  private String primaryAccountHolder;
  private String mobile;
  private String email;

  private Boolean isJointAccount;
  private String secondaryAccountHolder;



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



  /**
   * static inner class
   */
  public static class BankBuilder {

    private String bankAccountNumber;
    private String primaryAccountHolder;
    private String mobile;
    private String email;

    private Boolean isJointAccount;
    private String secondaryAccountHolder;

    public BankBuilder addBankAccountNumber(String bankAccountNumber){
      this.bankAccountNumber = bankAccountNumber;
      return this;
    }

    public BankBuilder addPrimaryAccountName(String primaryAccountName) {
      this.primaryAccountHolder = primaryAccountName;
      return this;
    }

    public BankBuilder addEmailAddress(String emailAddress) {
      this.email = emailAddress;
      return this;
    }

    public BankBuilder addMobile(String mobile) {
      this.mobile = mobile;
      return this;
    }


    public BankAccount builder() {
      BankAccount account = new BankAccount();
      account.bankAccountNumber = this.bankAccountNumber;
      account.primaryAccountHolder = this.primaryAccountHolder;
      account.email = this.email;
      return account;
    }



  }



}
