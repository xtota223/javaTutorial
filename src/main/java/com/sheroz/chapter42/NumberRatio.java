package com.sheroz.chapter42;
import java.util.Scanner;
//https://www.hackerrank.com/challenges/plus-minus/problem

public class NumberRatio {
static Scanner sc = new Scanner(System.in);
public static void main (String []args){

    int[] arr = new int[5];

    for(int i=0;i<5;i++) {
        arr[i] = sc.nextInt();
    }
    int poz=0, neg=0, zer=0;

    for (int value : arr) {
        if (value > 0)
            poz += 1;
        else if (value < 0)
            neg += 1;
        else
            zer += 1;
    }
    System.out.println( String.format( "%f", ( ((double) poz)/arr.length)));
    System.out.println( String.format( "%f", ((double) neg/arr.length)));
    System.out.println( String.format( "%f", ((double) zer/arr.length)));

    }
}


