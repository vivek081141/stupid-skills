package com.stupidskills.edu.enums;

public enum Currency {
  PENNY(1),
  NICKEL(5),
  DIME(10),
  QUATER(25);

  int value;

  Currency(int i) {
    this.value = i;
  }
}


