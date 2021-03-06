package com.stupidskills.edu.serialization;

import java.io.Serializable;
import java.util.Date;

public class CarFeatures implements Serializable {

  private String featureName;
  private String featureType;
  private Date startingDate;
  private String key;

  public CarFeatures(String key, String featureName, String featureType, Date startingDate ) {
    this.key = key;
    this.featureName = featureName;
    this.featureType = featureType;
    this.startingDate = startingDate;
  }

  public String getFeatureName() {
    return featureName;
  }

  public void setFeatureName(String featureName) {
    this.featureName = featureName;
  }

  public String getFeatureType() {
    return featureType;
  }

  public void setFeatureType(String featureType) {
    this.featureType = featureType;
  }

  public Date getStartingDate() {
    return startingDate;
  }

  public void setStartingDate(Date startingDate) {
    this.startingDate = startingDate;
  }

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }
}
