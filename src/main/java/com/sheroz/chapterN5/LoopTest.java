package com.sheroz.chapterN5;

public class LoopTest {

  public static void main(String[] args) {
    for (int  j=20;  j>0 ;  j-=2) {
      if (j==10) continue;
      if (j==6) {
        for (int i = 0; i < 5; i++) {
          System.out.println("     >> i=" +i);
        }
      }
      System.out.println("  j=" +j);

    }

  }

}
