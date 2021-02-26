package com.stupidskills.edu.serialization;

import java.io.Serializable;
import java.util.List;

//Serializable is marker interface
public class Car implements Serializable {
  private static final long serialVersionUID = 129348938L;

  private CarType carType;
  private CarColor color;
  private String length;
  private String engineCapacity;
  //NO LONGER BE SERIALIZED
  transient private Float price; //NULL

  private List<CarFeatures> features;

  //constructor
  public Car() {
    System.out.println("1st constructor");
  }

  //constructor
  public Car(CarType carType, CarColor color, String length, String engineCapacity) {
    System.out.println("2nd constructor");

    this.carType = carType;
    this.color = color;
    this.length = length;
    this.engineCapacity = engineCapacity;
  }

 //constructor
  public Car(CarType carType, CarColor color, String length, String engineCapacity, float price) {
    System.out.println("3rd constructor");

    this.carType = carType;
    this.color = color;
    this.length = length;
    this.engineCapacity = engineCapacity;
    this.price = price;
  }

  public CarType getCarType() {
    return carType;
  }

  public void setCarType(CarType carType) {
    this.carType = carType;
  }

  public CarColor getColor() {
    return color;
  }

  public void setColor(CarColor color) {
    this.color = color;
  }

  public String getLength() {
    return length;
  }

  public void setLength(String length) {
    this.length = length;
  }

  public String getEngineCapacity() {
    return engineCapacity;
  }

  public void setEngineCapacity(String engineCapacity) {
    this.engineCapacity = engineCapacity;
  }

  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
    this.price = price;
  }

  public List<CarFeatures> getFeatures() {
    return features;
  }

  public void setFeatures(List<CarFeatures> features) {
    this.features = features;
  }

 /* private void writeObject(ObjectOutputStream oos) throws Exception
  {
    System.out.println("Car write is getting called");
  }*/

  /*private void readObject(ObjectInputStream ois) throws Exception
  {
    System.out.println("Car read is getting called");
  }*/
}
