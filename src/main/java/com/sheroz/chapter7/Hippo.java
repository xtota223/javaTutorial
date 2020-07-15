package com.sheroz.chapter7;

public class Hippo extends Animal{

  public Hippo() {
    food= "Grass";
    
  }

  @Override
  void makeNoise() {
    System.out.println("Hippo noise " );
  }

//  @Override
//  void eat() {
//    System.out.println("grass" );
//  }
}
