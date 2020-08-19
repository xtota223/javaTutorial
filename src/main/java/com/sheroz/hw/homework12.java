package com.sheroz.hw;
import java.util.*;
import java.math.*;


public class homework12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("type in ten random numbers: ");
        int min = 0 , max =0 ;

        for (int z=0; z<10 ;z++) {
            int q = sc.nextInt();
           if (z ==0 ) {
               max= q;
               min= q;
           }
           else if (q>max ){
               max=q;
           }
           else  if (q<min) {
               min=q;
           }

        }

        System.out.println("the smallest number is: " +min );
        System.out.println("the largest number is: " +max );
    }
}