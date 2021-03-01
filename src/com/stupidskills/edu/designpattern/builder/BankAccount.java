package com.stupidskills.edu.designpattern.builder;

public class BankAccount {

  //
  public static int public_outer_static_x = 10;
  private static int private_outer_static_x = 20;

  public int public_outer_x = 30;
  private int private_outer_x = 40;

  // private member

  private String accountHolder;
  private int age;
  private String emailAddress;
  private String mobile;
  private String accountId;
  private String addressProof;

  private BankAccount() {
  }

  public String getAccountHolder() {
    return accountHolder;
  }

  public int getAge() {
    return age;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public String getMobile() {
    return mobile;
  }

  public String getAccountId() {
    return accountId;
  }

  public String getAddressProof() {
    return addressProof;
  }


  public static void test() {

  }




  public static class Builder {

    private int innerField;
    public static int innerstaticField;

    public int getStaticPrivateVariable() {
      //public_outer_x
      return private_outer_static_x;
    }

    public int getStaticVariable() {
      BankAccount bankAccount = new BankAccount();
      return public_outer_static_x;
    }

    public int getInstanceVariable() {
      return public_outer_static_x;
    }

    public int getInnerField() {
      return innerField;
    }

    public void setInnerField(int innerField) {
      this.innerField = innerField;
    }
  }

}
