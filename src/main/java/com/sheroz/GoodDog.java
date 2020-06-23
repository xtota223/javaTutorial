package com.sheroz;

public class GoodDog {
  private int size ;

  public void setSize(int size ) {

    if (size<0){
      throw new RuntimeException("ERROR : wrong size ");

    }
    else if (size>1000) {
      throw new RuntimeException("ERROR : Oversize ");
    }
    else {
      this.size= size;
    }

  }
  void bark (){

    if (size>60) {
      System.out.println( "WOOF");
    }
    else if (size >14) {
      System.out.println("Ruff");
    }
    else {
      System.out.println("Yep" );
    }
  }

}
