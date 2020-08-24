package com.sheroz.HomeWorkSwith;
import java.util.Scanner;

public class HomeWork5 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter unit price: ");
    int up = sc.nextInt();
        System.out.print("Enter quantity: ");
    int q = sc.nextInt();

    int revenue = up*q;
    System.out.println("The revenue from sale: " + revenue +"$");
        double discount = 0; //default

    if (q>=100 & q<=120){
        discount= 0.10;
    }
    else if (q>120){
        discount=0.15;
    }

        double FinalCost =(revenue - revenue*discount);
    System.out.println(FinalCost+ "$ after discount");
    }

}