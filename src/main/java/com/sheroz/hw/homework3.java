package com.sheroz.hw;
import java.util.Scanner;

public class homework3 {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        int y =sc.nextInt();
        for(int x =1;x<=10;x++) {
            int sum =x*y;
            System.out.println(y+ "x"+x+"="+ sum);
        }
    }
}
