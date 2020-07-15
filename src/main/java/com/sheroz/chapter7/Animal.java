package com.sheroz.chapter7;

public class Animal {
  String picture ;
  String food;
  Integer hunger;
  String boundary;
  String location ;


  void makeNoise () {
    System.out.println( "make noise :" + hunger );
  }
  void eat () {
    System.out.println( "eat : " + food );
  }
  void  sleep(){
    System.out.println( "sleep");
  }
  void roam() {
    System.out.println("alone");
  }

}
