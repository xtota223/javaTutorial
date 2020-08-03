package com.sheroz.Scanner;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("type in any simple number");

        int num = sc.nextInt();

        System.out.println("You entered" + num + " ");

    }
}