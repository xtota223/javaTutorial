package com.sheroz.chapter43;

//https://www.hackerrank.com/challenges/java-arraylist/problem

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Solution {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int size =  scanner.nextInt();
    List<List<Integer>> arrayList2d= new ArrayList<>();
    scanner.nextLine();


    for (int j=0 ; j<size; j++) {
      int jArraySize=  scanner.nextInt();
      arrayList2d.add(j, new ArrayList<>());
      for (int i=0 ; i<jArraySize; i++) {
        arrayList2d.get(j).add(scanner.nextInt());
      }
    }

    System.out.println("++++++++++++");
    for (int i=0 ; i<size; i++){
      for (Integer str : arrayList2d.get(i)){
        System.out.print( str + " " );
      }
      System.out.println();

    }

    System.out.println( "first : " +  arrayList2d.get(1-1).get(3-1) );


    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
  }
}
