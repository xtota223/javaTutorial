package com.sheroz.Scanner;

import java.util.*;

public class ScannerBoolean {
 static Scanner sc =  new Scanner(System.in);

    public static void main(String [] args) {

        System.out.print("True or False");

        boolean x =sc.nextBoolean();

        System.out.println("You entered" + x + " ");
    }
}
