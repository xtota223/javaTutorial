package com.sheroz.chapterN5;
import java.util.*;

public class Solution2 {
 public static void main(String[]args){

     Scanner in = new Scanner(System.in);

     int a =in.nextInt();
     int b =in.nextInt();
     int n =in.nextInt();

     int sum=a;

     for (int i=0 ; i<n; i++){
       // (a+ 2^i * b ),  (sum   + 2^(i+1) * b ) ) ,  (sum + 2^(i+2) * b  ) )
        sum = sum  + ( (int) Math.pow(2, i ) * b );
        // sum = 2
        System.out.print( sum + " ");
     }

//2 6 14 30 62 126 254 510 1022 2046
 }

}
// https://www.hackerrank.com/challenges/java-loops/problem