package com.sheroz.chapter7.hw;

import java.util.Objects;

public class Boat {
  private int length;

  public void  setLength(int len ) {
    length= len ;
  }
  public void  move(){
    System.out.print("drift  " );
  }

  @Override
  public String toString() {
    return "length: " + length;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Boat boat = (Boat) o;
    return length == boat.length;
  }

  @Override
  public int hashCode() {
    return Objects.hash(length);
  }
}


