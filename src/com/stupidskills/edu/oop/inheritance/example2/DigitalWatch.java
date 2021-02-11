package com.stupidskills.edu.oop.inheritance.example2;


/*
      Classic Watch - Parent, Base Class, Super Class
      Digital Watch - Child, Derived Class, Sub Class

      RELATIONSHIP - IS A

 */
public class DigitalWatch extends  ClassicWatch {


  /**
   We are over riding an existing method and providing a new implementation
   * @return
   */
  @Override
  public String getTime() {
    return "Time in Digital Format";
  }

  /**
   * New implementation
   * @return
   */
  public String getHeartBeat() {
    return "Heart Beat of the user";
  }

  public String getPulseRate() {
    return "Pulse Rate";
  }


}
