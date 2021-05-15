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
    int inp =4;
      int num= arr[0];
      for (int i =0; i<arr.length;i++)
          if (arr[i]==inp)
              return i;



    return -1 ;
  }


  /**
   * find if given value aready exist in array
   * @param arr
   * @param value
   * @return
   */
  public static boolean isDuplicate(int[] arr ) {
      int num =arr[0];
      for (int i = 1; i<arr.length;i++)
          for (int j=1;j<arr.length;j++)
              if (arr[i] == arr[j])
                  return true;
    return false;
  }
  /**
   * find if given value aready exist in array
   * @param arr
   * @param value
   * @return
   */
  public static boolean isDuplicate(int[] arr, int value  ) {
      int inp=4;
      int duplicate =0;
      int num =arr[0];
      for (int i = 1; i<arr.length;i++)
              if (inp== arr[i])
                  duplicate=duplicate+1;
              if (duplicate >0) ;
return true;

  }
}

