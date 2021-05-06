package com.sheroz.array;
import java.util.Scanner;

public class ArrayUtils {
    Scanner sc = new Scanner(System.in);
  /*
      find max value from array
   */
  public static  int max(int[] arr) {
 int maxi= 0;
    for (int i = 0; i<arr.length;i++)
      if (arr[i]>maxi)
        arr[i]= maxi;
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
      for (int i = 3; i<8;i++)
          if (arr[i]>maxi)
              arr[i]= maxi;
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
      int min =100;
      for (int i = 0; i<arr.length;i++)
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
}

