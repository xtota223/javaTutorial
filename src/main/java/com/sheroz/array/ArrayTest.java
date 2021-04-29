package com.sheroz.array;

public class ArrayTest {

  public static void main(String[] args) {
    int[] arr1 = {1,2,40,1,-1, 0 , 12, -12 };
    int[] arr2 = {3,4,7,1,3 };

    System.out.println(ArrayUtils.max(arr1 )==40);
    System.out.println(ArrayUtils.max(arr2 )==7);
    System.out.println(ArrayUtils.avrg(arr2 )==3 );


  }


}
