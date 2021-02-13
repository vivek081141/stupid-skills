package com.stupidskills.edu.oop.abstraction.example1;

public abstract class RBIBank extends  Bank {

  public RBIBank() {
    System.out.println("bank constructor");
  }

  public abstract boolean closeAccount();

}
