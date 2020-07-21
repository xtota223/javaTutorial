package com.sheroz.chapter7.hw;

public class TestBoat {

  public static void main(String[] args) {
    Boat b1 = new Boat();
    SaiBoat b2= new SaiBoat();
    RowBoat b3= new RowBoat();
    b2.setLength(32);
    b3.setLength(32);
    b1.move();
    b3.move();
    b2.move();
    System.out.println( "=================");

    System.out.println( b2.equals(b3));



  }

}
