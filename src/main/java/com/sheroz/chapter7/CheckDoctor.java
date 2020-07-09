package com.sheroz.chapter7;

public class CheckDoctor {

  public static void main(String[] args) {
    Doctor dc = new Doctor();

    dc.tritePatient();
    dc.whoAreYou();


    System.out.println( "------------");

    Doctor fdc = new FamilyDoctor();
    fdc.tritePatient();

    fdc.whoAreYou();
    ((FamilyDoctor)fdc).notInDoctor();

  }

}
