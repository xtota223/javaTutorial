package com.sheroz;

import java.util.Scanner;

public class Random {

  public static void main(String[] args) {

    Random rd = new Random();
    rd.findMe((int) (Math.random() *5 ) );

  }
   void findMe(int x ) {
     Scanner sc = new Scanner(System.in);

    while (true ) {

      int quat = sc.nextInt();
      if (quat == x) {
        System.out.println("WIN");
        break;
      }
      else {
        System.out.println("MISS");
      }
    }
   }
}
