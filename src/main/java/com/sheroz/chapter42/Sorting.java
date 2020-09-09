package com.sheroz.chapter42;

import java.util.Arrays;

public class Sorting {

  public static void main(String[] args) {
    int arr[] = new int[20];

    for (int i =0 ; i< arr.length; i++) {
      arr[i] = (int )(Math.random()*1000);
    }

    for (int val : arr) {
      System.out.println(val );
    }

    new Sorting().bubbleSort(arr);
    System.out.println("Sorted ");

    for (int val : arr) {
      System.out.println(val );
    }
  }
 //  [ 1, 2, 3, 4,5 ]
  void bubbleSort(int[] arr) {
    for (int j=0; j< arr.length; j++) {
      for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] > arr[i + 1]) {
          swap(arr, i, i + 1);
        }
      }
    }

  }
  void swap(int[] arr , int poz1, int poz2 ) {
    int tmp= arr[poz1];
    arr[poz1]= arr[poz2];
    arr[poz2] = tmp;
  }


}
