package com.sheroz.array;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

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

      for(int i =0;i<arr3.length && i< arr4.length;i++){
          if (arr3[i] == arr4[i]){
              return true;
          }
      }
    return false;
  }

  /**
   * compare  elements  of arrays equality
   * arr1 [1,3, 2] arr2 [1,2, 3]  = true
   * arr1 [1,2, 3] arr2 [1,4]  = false
   * @param arr
   * @return
   */

  public static boolean compareElements (int[] arr1, int[] arr2) {
      for(int i=0;i< arr1.length;i++){
          for (int d =0;d<arr2.length;d++){
              if (arr1[i]==)
          }
      }
    return false;
  }

}

