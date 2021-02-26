package com.stupidskills.edu.exception.exercises;

//Custom Exception Class (Unchecked Exception Class)
public class GenericException extends RuntimeException {
  String code; //TODO

  GenericException(String s){
    super(s);
  }

  public GenericException(String code, String message) {
    super(message);
    this.code = code;
  }
}
