package com.sheroz.hw;
import java.util.Scanner;

public class homework10 {
    public static void main(String[]args){


        boolean KeepPlaying=true;

        Scanner sc = new Scanner(System.in);
        System.out.print("enter two numbers: ");


        do {
            int a = sc.nextInt();
            int b = sc.nextInt();

        int sum =a+b;
            System.out.println("sum is "+ sum);
        System.out.print("do you want to continue ");
        System.out.println("type-in y/n");
        String input = sc.next();

        if (input.equalsIgnoreCase("y"));
        else if (input.equalsIgnoreCase("n")) {
            KeepPlaying = false;
          }
        }while(KeepPlaying);
        }

    }

