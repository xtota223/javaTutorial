package com.sheroz.chapter43;

//https://www.hackerrank.com/challenges/java-arraylist/problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int size =  scanner.nextInt();
    List<List<String>> arrayList2d= new ArrayList<>();
    scanner.nextLine();
    for (int i=0 ; i<size; i++){
      arrayList2d.add(new ArrayList<String>());
      for (String st : scanner.nextLine().split(" ")) {
        arrayList2d.get(i).add(st);
      }


    }

    for (int i=0 ; i<size; i++){
      for (String str : arrayList2d.get(i)){
        System.out.print( str + " " );
      }
      System.out.println();

    }


    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
  }
}
