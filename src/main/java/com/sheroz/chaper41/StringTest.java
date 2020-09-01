package com.sheroz.chaper41;

public class StringTest {

  public static void main(String[] args) {
    String test = "Hello World";

    System.out.println(test );
    System.out.println( test.length() );
    System.out.println(test.substring(6  ));
    System.out.println(test.substring(0, 5 ) );
    System.out.println(test.concat("!") );
    System.out.println(test.replace("o", "0" ) );
    System.out.println(test.charAt(2 ) );
    for (Byte b: test.getBytes()) {
      System.out.println(  b);
    }

    for (String st : test.split("l")) {
      System.out.println(st );
    }

  }

}
