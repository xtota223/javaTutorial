package com.sheroz;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {

            int N = scanner.nextInt();
        int x = (N%2);
        //System.out.println(x);

            if (x == 0){
                System.out.println("Not Weird");
            }
            else  {
                System.out.println("Weird");
            }

            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            scanner.close();
        }
    }

