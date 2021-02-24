package com.stupidskills.edu.serialization;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

public class Car implements Serializable {

  private static final long serialversionUID = 129348938L;

  private CarType carType;
  private String color;
  private String length;
  private String engineCapacity;
  private float price;

  private List<CarFeatures> features;


  public CarType getCarType() {
    return carType;
  }

  public void setCarType(CarType carType) {
    this.carType = carType;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
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

  private void writeObject(ObjectOutputStream oos) throws Exception
  {
    System.out.println("Car write is getting called");
  }

  private void readObject(ObjectInputStream ois) throws Exception
  {
    System.out.println("Car read is getting called");
  }
}
