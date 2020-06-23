package com.sheroz;

public class pg82 {

  public static void main(String[] args) {
    System.out.println( 3==3 );
    System.out.println( 4==3 );
    System.out.println( 4>3 );
    System.out.println( 4>(3+3) );
    if (4>(3+3)) {
      System.out.println("true");
    }
    else {
      System.out.println("false");
    }

    GoodDog gd1= new GoodDog();
    gd1.setSize(1045);
    gd1.bark();

  }

}
