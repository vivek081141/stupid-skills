package com.stupidskills.edu.oop.abstraction.abstractclass;

public abstract class RBIBank extends  Bank {

  public RBIBank() {
    super(); //this is hidden
    System.out.println("bank constructor");
  }

  public abstract boolean closeAccount();

}
