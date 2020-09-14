package com.sheroz.chapter42;
import java.util.Arrays;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/java-2d-array/problem

public class HourGlass {
    static Scanner sc = new Scanner(System.in);
    public static void main (String []args){
        int [][] num = new int[8][8];
        int sum = 0;

        for (int y= 0; y<=5; y++){
            for (int x=0; x<=5; x++){
               num[y][x] = sc.nextInt();
            }
        }
        int max = 0;
        for (int a=0; a <=5; a ++) {
           for (int b = 0; b <=5; b++) {
               sum = num[a][b] + num[a][b + 1] + num[a][b + 2] + num[a + 1][b + 1] + num[a + 2][b] + num[a + 2][b + 1] + num[a + 2][b + 2];

               }
            }
        System.out.println(sum);
        }
    }


//      opposite in java   ?? y,x
//      test;
//      1 1 1 0 0 0
//      3 1 0 0 0 0
//      1 1 1 0 0 0
//      0 0 0 0 0 0
//      0 0 0 0 0 0
//      0 0 0 0 0 0
//      sout(num [1][0]);
//      the output was; 3


//2loop to declare every thing in 36 arrays typed by the user;
//need something to calculate the sum of the arrays!!!!!!

//          y,x
//sum = num(0,0) +num(1,0) +num(2,0) + num(1,1) +num(2,0) +num()






