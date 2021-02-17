package com.stupidskills.edu.enums;

public enum GenderEnum {
  MALE ("M", "Male"), FEMALE ("F", "Female");

  String key;
  String displayName;

  GenderEnum(String m, String male) {
    this.key = m;
    this.displayName = male;
  }
}
