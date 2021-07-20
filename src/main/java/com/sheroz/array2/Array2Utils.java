package com.sheroz.array2;

public class Array2Utils {

  //   1 ,2 ,3
  //   4 , 5, 6
  //   7 ,8 , 9
  static  void printMe(int[][] arr1) {
    for (int[] v1: arr1) {
      for (int data : v1) {
        System.out.print( data + "  " );
      }
      System.out.println( "" );
    }
  }

  static int sum (int[][] arr1) {
    int sum=0;
   for (int i=0;i<arr1.length;i++){
     for (int d=0;d<arr1[i].length;d++){
       sum += arr1[i][d];
     }
   }
   return sum;
  }

  static int sumRow(int[][] arr1, int rowIndex) {
    int sum=0;
    for (int i=0;i< arr1.length;i++){
      sum += arr1[rowIndex][i];
    }
    return sum ;
  }

  static int max (int[][] arr1) {
    int max=arr1[0][0];
    for (int i = 0;i <arr1.length;i++){
      for (int d = 0;d<arr1[i].length;d++){
        if (max<arr1[i][d]) max= arr1[i][d];
      }
    }
    return max;
  }

  static int maxRow (int[][] arr1, int rowIndex) {
    int Cmax=0;
    int Rmax=0;
    for (int i=0; i< arr1.length-1;i++){
      Cmax = arr1[rowIndex][0] + arr1[rowIndex][i+1];
      if (Cmax >= Rmax){
        Rmax=Cmax;
      }
    }
    return Rmax ;
  }



}
