package com.sheroz.hw;
import java.util.Scanner;

public class homework4 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Type in the number that you want to factor: ");
        int x = sc.nextInt();
        System.out.print("The factors of"+x +"are:");
        for(int y =1; y<=x;y++){

        int equal =x%y;
        if (equal==0) {

        System.out.print(y+", ");

           }
        }
    }
}
