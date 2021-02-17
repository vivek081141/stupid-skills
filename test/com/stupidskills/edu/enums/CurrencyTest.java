package com.stupidskills.edu.enums;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CurrencyTest {

  @Test
  public void test() {
    Currency currency = Currency.NICKEL;
    System.out.println(currency);
    System.out.println(currency.value);
  }

  @Test
  public void switchTest() {
    Currency currency = Currency.DIME;
    switch ( currency ) {
      case DIME:
        System.out.println("DIME");
        break;
      case NICKEL:
        System.out.println("nickel");
        break;
      default:
        System.out.println("Deafult is Quater");
    }
  }
}