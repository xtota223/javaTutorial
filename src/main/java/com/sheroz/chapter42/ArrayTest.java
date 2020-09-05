package com.sheroz.chapter42;


import java.util.Arrays;

public class ArrayTest {

  public static void main(String[] args) {
    String[] strArray= new String[20];
    System.out.println(strArray.length);

    for (int i=0 ; i<strArray.length; i++) {
       strArray[i]= "test  " + i;
    }


    for (int i=0 ; i<strArray.length; i++) {
      int i1 = (int)(Math.random() *strArray.length);
      int i2 = (int)(Math.random() *strArray.length);
      String tmp = strArray[i1];
      strArray[i1]= strArray[i2];
      strArray[i2]=tmp;
    }

    for (String st : strArray) {
      System.out.println(st );
    }

    Arrays.sort(strArray);
    System.out.println("Sorted: ");
    for (String st : strArray) {
      System.out.println(st );
    }
    System.out.println(" COPY" );
    for (String st : Arrays.copyOfRange(strArray, 4,12)) {
      System.out.println(st);
    }

    

  }

}
