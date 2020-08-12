package com.sheroz.chapterN4;

import java.util.BitSet;

public class BooleanTest {

  public static void main(String[] args) {

    System.out.println(3==4 );
    System.out.println(4==4 );
    System.out.println(3!=4 );
    System.out.println(3>4 );
    System.out.println(3<4 );
    System.out.println(3>=4 );
    System.out.println(4>=4 );
    System.out.println( "2)===============");
    String  x="sheroz" , y= "sheroz", w= "Shirin";




    System.out.println("x =" + x  );
    System.out.println("y =" + y  );

    if  (x.equalsIgnoreCase(y)) {
      if (x.equals(y)) {
        System.out.println(String.format( "%s equals to   %s " , y, x) );
      }
      else{
        System.out.println(String.format( "%s equals to  igonreCase %s " , y, x) );
      }

    }
    else if (x.compareTo(y)>0 ) {
      System.out.println(String.format( "%s greater then %s " , x, y) );
    }
    else {
      System.out.println(String.format( "%s greater then %s " , y, x) );
    }
    System.out.println(" 3) ==================== ") ;


    if  (! x.equalsIgnoreCase(y)) {
      System.out.println( "it's  not Sheroz" );
    }
    else {
      System.out.println( "it's   Sheroz" );
    }


    System.out.println(" 4) ==================== ") ;


    if  (x.equalsIgnoreCase(y) && x.equalsIgnoreCase(w))  {
      System.out.println( "it's   Sheroz" );
    }
    else {
      System.out.println( "it's  not  Sheroz" );
    }


    System.out.println(" 5) ==================== ") ;


    if  ( (false  ^  false) || ((x.equalsIgnoreCase(y)) && x.equalsIgnoreCase(w) ) )  {
      System.out.println( "it's true " );
    }
    else {
      System.out.println( "it's  false " );
    }


//  true || false = true
//   false || false = false
//   true && false = false
 // false && true = false

  }


}
