package com.sheroz.Scanner;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("type in any line");
        String ww="";
        while( !"quite".equalsIgnoreCase(ww) ) {
            ww=  sc.nextLine();
            System.out.println("You entered: " + ww);
        }


    }
}