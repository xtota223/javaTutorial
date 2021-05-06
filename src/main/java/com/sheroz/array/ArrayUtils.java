package com.sheroz.array;
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
      int min =arr[0];
      for (int i = 1; i<arr.length;i++)
          if (arr[i]<min)
              arr[i]=min;
      return min;

  }

  /**
   *  find min value from "from" position
   * @param arr
   * @param from
   * @return
   */
  public static int min(int[] arr, int from ) {
    return 0;
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
    return -1 ;
  }


  /**
   * find if given value aready exist in array
   * @param arr
   * @param value
   * @return
   */
  public static boolean isDuplicate(int[] arr ) {
    return false;
  }
  /**
   * find if given value aready exist in array
   * @param arr
   * @param value
   * @return
   */
  public static boolean isDuplicate(int[] arr, int value  ) {
    return false;
  }
}

