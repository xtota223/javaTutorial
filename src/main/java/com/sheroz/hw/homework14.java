package com.sheroz.hw;
import java.util.Scanner;
import java.math.*;

public class homework14 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println(" Enter fib number : ");
    int q = sc.nextInt();
    if (q <= 1 ) {
      System.out.println(q);
    }
    System.out.print( " 0 1 ");
    int first=0 , second=1 , fin= 1;

    for (int i=2; i<=q; i++ ) {
      fin= first +second;
      first = second;
      second= fin;
      System.out.print( fin  + " ");
    }
//0 1 1 2 3 5 8 13 24

  }



}
