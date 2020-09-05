package com.sheroz.chapter42;

public class Array2Test {

  public static void main(String[] args) {
    int[][][] intArray = new int[10][5][20];
    for (int j =0 ; j< 5; j++) {
      for (int i = 0; i < 10; i++) {

        intArray[i][j][0] = j*  i;
      }
    }
    // [0] [0,1,2,3,4,5,6,7,8,9]
    //  [1] [0,1,2,3,4,5,6,7,8,9]
    //  [2] [0,1,2,3,4,5,6,7,8,9]
    //  [3] [0,1,2,3,4,5,6,7,8,9]
    //  [4] [0,1,2,3,4,5,6,7,8,9]
    //  [5] [0,1,2,3,4,5,6,7,8,9]
    for (int j =0 ; j< 5; j++) {
      for (int i = 0; i < 10; i++) {
        System.out.print(intArray[i][j][0] + " ");
      }
      System.out.println();
    }

  }

}
