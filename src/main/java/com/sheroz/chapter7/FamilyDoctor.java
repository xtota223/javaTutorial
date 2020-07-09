package com.sheroz.chapter7;

public class FamilyDoctor extends Doctor {

  @Override
  public void whoAreYou( ) {
    System.out.println( "I'm family doctor");
  }

  public void notInDoctor(){
    System.out.println( "only Family");
  }
}
