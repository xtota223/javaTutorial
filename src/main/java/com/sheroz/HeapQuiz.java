package com.sheroz;

public class HeapQuiz {
  int id =0 ;

  public static void main(String[] args) {
    int x =0 ;
    HeapQuiz[] hq = new HeapQuiz[5];
    while (x<3) {
      hq[x]= new HeapQuiz();
      hq[x].id=x ;
      x=x+1;
    }
    hq[3]= hq[1];
    hq[4]= hq[1];
    hq[3]= null;
    hq[4]= hq[0];
    hq[0]= hq[3];
    hq[3]= hq[1];
    hq[2]= hq[0];

    for (int i=0 ; i<5; i++) {
      System.out.println(" hq[" + i + "] = " + (hq[i] == null ? "null" : hq[i].id) );
    }


  }

}
