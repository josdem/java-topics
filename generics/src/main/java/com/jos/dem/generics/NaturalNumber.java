package com.jos.dem.generics;

public class NaturalNumber<T extends Integer> {
  private T number;

  public NaturalNumber(T number){
    this.number = number;
    if(number < 0 ){
      throw new IllegalArgumentException();
    }
  }

  public boolean isEven() {
	  return this.number.intValue() % 2 == 0;
  }

}