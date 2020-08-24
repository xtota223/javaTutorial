package com.sheroz.HomeWorkSwith;
import java.util.Scanner;

public class HomeWork2 {
    static Scanner sc = new Scanner(System.in);
    public static void main (String []args){
        System.out.println("What is the correct way to declare a variable to store an integer value in Java?\n"
                + "a. int 1x=10;\n"
                + "b. int x=10;\n"
                + "c. float x=10.0f;\n"
                + "d. string x=10;\n"
                + "Enter your choice: ");
        String s =sc.next();
        char choice = s.charAt(0);
        String msg;

        switch (choice){
            case 'A':
            case 'a':
                msg = "wrong";
                break;
            case 'B':
            case 'b':
                msg = "correct";
                break;
            case 'C':
            case 'c':
                msg = "wrong";
                break;
            case 'D':
            case 'd':
                msg = "wrong";
                break;
            default:
                msg = "wrong";
                break;
        }
        System.out.println(msg);
    }
}
