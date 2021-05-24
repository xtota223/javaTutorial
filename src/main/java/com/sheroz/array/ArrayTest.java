package com.sheroz.array;

public class ArrayTest {

  public static void main(String[] args) {
    int[] arr1 = {1,2,40,1,-1, 0 , 12, -12 };
    int[] arr2 = {5, 5,4,7,1,3 };

    int[] arr3 = {1,2,3,4,5};
    int[] arr4 = {1,2,3,4,5};
    int[] arr5 = {5,4,3,2,1};

    System.out.println(ArrayUtils.max(arr1 )==40);
    System.out.println(ArrayUtils.max(arr1, 3)==12);
    System.out.println(ArrayUtils.max(arr2 )==7);
    System.out.println(ArrayUtils.avrg(arr2 )==3 );
    System.out.println(ArrayUtils.min(arr2 )==1 );
    System.out.println(ArrayUtils.sum(arr1 )==18 );
    System.out.println( ArrayUtils.findPosition(arr1, 40 )==2 );
    System.out.println( ArrayUtils.isDuplicate(arr2, 1 ) );
    System.out.println( ArrayUtils.isDuplicate(arr2 ) );
    System.out.println(ArrayUtils.findBigSum(arr2)==12);
    System.out.println(ArrayUtils.compare(arr3,arr4));
    System.out.println(ArrayUtils.compareElements(arr1,arr2));
  }
}
