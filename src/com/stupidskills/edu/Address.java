package com.stupidskills.edu;

public class Address {

  private String city;
  private String country;
  private String pin;

  public Address() {
  }

  public Address(String city, String country, String pin) {
    this.city = city;
    this.country = country;
    this.pin = pin;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getPin() {
    return pin;
  }

  public void setPin(String pin) {
    this.pin = pin;
  }
}
