package com.sheroz.array;

import java.util.Arrays;

public class ArrayUtils {

  /*
      find max value from array
   */
  public static  int max(int[] arr) {
 int maxi= arr[0];
    for (int i = 1; i<arr.length;i++)
      if (arr[i]>maxi)
         maxi=arr[i];
      return maxi;
  }

  /**
   *  find max from "from position"
   * @param arr
   * @param from
   * @return
   */
  public static  int max(int[] arr, int from) {
      int maxi= 0;
    for (int i = from; i<arr.length;i++)
          if (arr[i]>maxi)
            maxi=arr[i];
      return maxi;
  }


  /**
   *  find max from "from to "to" position"
   * @param arr
   * @param from
   * @return
   */
  public static  int max(int[] arr, int from, int to ) {
    return 0;
  }

  /*
    find min value from array
 */
  public static int min(int[] arr) {
      return min(arr, 0);

  }

  /**
   *  find min value from "from" position
   * @param arr
   * @param from
   * @return
   */
  public static int min(int[] arr, int from ) {
    int min =arr[0];
    for (int i = from; i<arr.length;i++)
      if (arr[i]<min)
        min=arr[i] ;
    return min;
  }

  /**
   *  find min value from "from"  to "to" position
   * @param arr
   * @param from
   * @return
   */
  public static int min(int[] arr, int from , int to ) {
    return 0;
  }

  /*
    find average value from array
*/
  public static int avrg(int[] arr) {
    int sum = 0;
    for (int el: arr) {
      sum=sum+el;
    }
    return sum/arr.length;
  }

  /*
    find sum value from array
*/
  public static int sum(int[] arr) {
      int sum =0;
      for (int i = 0; i<arr.length;i++)
          sum += arr[i];
      return sum;
  }

  /**
   * find "value" position in array
   * @param arr
   * @param value
   * @return
   */
  public static int findPosition (int[] arr, int value  ) {

      for (int i =0; i<arr.length;i++){
        if (arr[i]==value) return i;
      }

    return -1 ;
  }


  /**
   * find if given value aready exist in array
   * @param arr
   * @param value
   * @return
   */
  public static boolean isDuplicate(int[] arr ) {
    return isDuplicate(arr, 0);
  }
  /**
   * find if given value aready exist in array
   * @param arr
   * @param value
   * @return
   */
  public static boolean isDuplicate(int[] arr, int value  ) {
    for (int i = value; i<arr.length-1;i++) {
      for (int j=i+1;j<arr.length;j++) {
        if (arr[i] == arr[j]) return true;
      }
    }
    return false;

  }

  /**
   *   find sum of 2 element in array with biggest sum
   *
   *   arr [3, 4,8] = 12
   *   arr [1, 100, -2 , 12, 34] = 134
   *   max = 134
    */


  public static int findBigSum(int[] arr) {
      int bigsum=arr[0];
      for(int i =0;i<arr.length;i++) {
          for(int d= i+1;d<arr.length;d++)
          if (arr[i] + arr[d] > bigsum) {
              bigsum = arr[i] + arr[d];
          }
      }
    return bigsum ;
  }

  /**
   * compare sequence  of arrays equality
   * arr1 [1,2, 3] arr2 [1,2, 3]  = true
   * arr1 [1,2, 3] arr2 [1,4]  = false
   * @param arr
   * @return
   */

  public static boolean compare(int[] arr3, int[] arr4) {
      if (arr3.length != arr4.length) return false;
      for(int i =0;i<arr3.length ;i++){
          if (arr3[i] != arr4[i]){
              return false;
          }
      }
    return true;
  }

  /**
   * compare  elements  of arrays equality
   * arr1 [1,3, 2] arr2 [1,2, 3]  = true
   * arr1 [1,3, 2,1] arr2 [1,1, 2, 3]  = true      * arr1 [1,1, 2,3] arr2 [1,1, 2, 3]  = true
   * arr1 [1,2, 3] arr2 [1,4]  = false
   * @param arr
   * @return
   */

  public static boolean compareElements (int[] arr1, int[] arr2) {

    Arrays.sort(arr1);
    Arrays.sort(arr2);
    return compare(arr1, arr2);
  }

  /**
   *  Bubble sort
   * @param arr1
   * @return
   */
  //public static boolean sort (int[] arr1) {
   // boolean wasChanged= true ;
   // while (wasChanged) {
   //   wasChanged=false ;
   //   for (sdfd) { // loop
    //    if (a>b) { // compare
    //      swap (a, b ) // swapp
    //      wasChanged= true;
    //    }
   //   }

  //  }
 // }

  /**
   * copy array from start position to end position
   * @param arr1
   * @param start
   * @param end
   * @return
   */

  public static int[] copy(int[] arr1, int start , int end ) {
    int[] result = new int[end-start+1];
    for (int i=0; i<result.length;i++)
        result[i]=arr1[i+start];

    return result;
  }




  //test sample for sort
  public static int[] sorting (int[] arr1) {
      boolean wasChanged = true;
      while (wasChanged) {
          wasChanged = false;
          int a;
          int b;
          for (int i = 0; i < arr1.length; i++) {
              a = arr1[i];
              b = arr1[i + 1];
              if (arr1[i] > arr1[i + 1]) {
                  arr1[i + 1] = a;
                  arr1[i] = b;
                  wasChanged= true;
              }
          }
      }
      return arr1;
  }
}

