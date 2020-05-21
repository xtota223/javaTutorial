package com.sheroz;

public class ThingsLike {
    public static void main(String args[]) //fixed  (there was an error)
    {
        Double mySalary ;
        mySalary = 100000.00;
        System.out.println ("chocolate, royalties, sleep " + mySalary);  //fixed (there was an error)
      for (int i =0 ; i<100; i++) {
        new Litele().functionname();
        new Litele().functionname2();
        new Litele().functionname2(i);
        new Litele().functionname2(i, i);
      }

    }
  

}

class  Litele {
     void functionname () {
         System.out.println( "Litele method functionname 1 " );
     }

  void functionname2 () {
    System.out.println( "Litele method functionname 2 " );
  }

  void functionname2 (int i ) {
    System.out.println( "step: " + i);
  }

  void functionname2 (int i, int i2  ) {
    System.out.println( "step: " + (i + i2) );
  }


}