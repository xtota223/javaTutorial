package com.sheroz.HomeWorkSwith;

public class MethodExample {

  public static void main(String[] args) {
    MethodExample mt = new MethodExample();
    System.out.println( mt.sum( 4, 10, 12) );
    System.out.println( mt.sum( 14, 343, 565) );
    System.out.println( mt.sum( 23, 343, 3432) );
    System.out.println( mt.sumRand() );
    mt.concat("hello ", " Word ");
    TmpClass tmp = new TmpClass();
    tmp.i=10 ;
    mt.change(tmp);
    System.out.println(  "out of  method I: " + tmp.i );

    int i=10 ;
    mt.change(i);
    System.out.println(  "out of  method I: " +i  );

  }

  public void change(TmpClass  temp ) {
    temp.i++;
    System.out.println(  "in method I: " + temp.i);
  }

  public void change(int i ) {
   i++;
    System.out.println(  "in method I: " + i);
  }

  public static  double sumRand() {
    return Math.random() *22222;
  }
  public static  int sum(int x , int y) {
    return x+y;
  }

  public  int sum(int x , int y, int z) {
    return  sum(x,y) +z;
  }

  public void   concat(String tmp1, String tmp2) {
    String tmp3 = tmp1+ tmp2;
    System.out.println( tmp3);

  }
}

class  TmpClass {
  int i ;

}