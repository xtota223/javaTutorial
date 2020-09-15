package com.sheroz.chapter42;

public class SubArray {

 //  https://www.hackerrank.com/challenges/java-negative-subarray/problem

  public static void main(String[] args) {
    int findSubArray=0 ;
    int[]  arr= {1, -2, 4, -5,1};

    for (int step=1 ; step<= arr.length; step++ ) {
      for (int j=0 ; j< (1 + arr.length-step); j++ ) {
          int sum =0 ;
          for (int jStep=j; jStep< (j+step); jStep++    ) {
            sum += arr[jStep];

          }
          if (sum<0) findSubArray++;
      }

    }
    System.out.println(findSubArray );

  }

}
