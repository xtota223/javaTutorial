package com.sheroz.array2;

public class Array2Test {

  public static void main(String[] args) {
    int[][] arr1 = {{1, 2 ,40}, {0, 12, -12}, {2, 4, 5}, {12, 14, 15}};
    Array2Utils.printMe(arr1);
    System.out.println(Array2Utils.sum(arr1));
    System.out.println(Array2Utils.max(arr1));
    System.out.println("Sum in row: " + Array2Utils.sumRow(arr1,0));
    System.out.println("Max in row: " + Array2Utils.maxRow(arr1,1));

  }

}
