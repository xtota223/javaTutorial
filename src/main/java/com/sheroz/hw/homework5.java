package com.sheroz.hw;
import java.util.Scanner;

public class homework5 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int x =sc.nextInt();
        System.out.print("enter the power for number:");
        int y =sc.nextInt();
        int sum = (int) Math.pow(x,y);
        System.out.println("the answer is: "+ sum);
    }
}
