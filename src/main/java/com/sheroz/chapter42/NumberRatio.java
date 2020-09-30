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
    int poz=0;
    int neg=0;
    int zer=0;

    for(int i=0;i<5;i++) {
        if (arr[i]>0)
            poz+=1;
        else if (arr[i]<0)
            neg+=1;
        else if (arr[i]==0)
            zer+=1;
    }
    double pozf=(poz/arr.length);
    double negf=(neg/arr.length);
    double zerf=(zer/arr.length);

    System.out.println(pozf+"\n"+negf+"\n"+zerf);

    }

}
//   System.out.println("there is: "+poz+" positive numbers.\n"+
//                     "there is: "+neg+" negative numbers.\n"+
//                    "there is: "+zer+" zero numbers.\n");



