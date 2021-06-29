package com.sheroz.array;


import java.util.Arrays;

public class ArrayUtils {

  /*
      find max value from array
   */
  public static int max(int[] arr) {
    int maxi = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > maxi) {
        maxi = arr[i];
      }
    }
    return maxi;
  }

  /**
   * find max from "from position"
   */
  public static int max(int[] arr, int from) {
    int maxi = 0;
    for (int i = from; i < arr.length; i++) {
      if (arr[i] > maxi) {
        maxi = arr[i];
      }
    }
    return maxi;
  }


  /**
   * find max from "from to "to" position"
   */
  public static int max(int[] arr, int from, int to) {
    return 0;
  }

  /*
    find min value from array
 */
  public static int min(int[] arr) {
    return min(arr, 0);

  }

  /**
   * find min value from "from" position
   */
  public static int min(int[] arr, int from) {
    int min = arr[0];
    for (int i = from; i < arr.length; i++) {
      if (arr[i] < min) {
        min = arr[i];
      }
    }
    return min;
  }

  /**
   * find min value from "from"  to "to" position
   */
  public static int min(int[] arr, int from, int to) {
    return 0;
  }

  /*
    find average value from array
*/
  public static int avrg(int[] arr) {
    int sum = 0;
    for (int el : arr) {
      sum = sum + el;
    }
    return sum / arr.length;
  }

  /*
    find sum value from array
*/
  public static int sum(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }

  /**
   * find "value" position in array
   */
  public static int findPosition(int[] arr, int value) {

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == value) {
        return i;
      }
    }

    return -1;
  }


  /**
   * find if given value aready exist in array
   */
  public static boolean isDuplicate(int[] arr) {
    return isDuplicate(arr, 0);
  }

  /**
   * find if given value aready exist in array
   */
  public static boolean isDuplicate(int[] arr, int value) {
    for (int i = value; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          return true;
        }
      }
    }
    return false;

  }

  /**
   * find sum of 2 element in array with biggest sum
   *
   * arr [3, 4,8] = 12 arr [1, 100, -2 , 12, 34] = 134 max = 134
   */


  public static int findBigSum(int[] arr) {
    int bigsum = arr[0];
    for (int i = 0; i < arr.length; i++) {
      for (int d = i + 1; d < arr.length; d++) {
        if (arr[i] + arr[d] > bigsum) {
          bigsum = arr[i] + arr[d];
        }
      }
    }
    return bigsum;
  }

  /**
   * compare sequence  of arrays equality arr1 [1,2, 3] arr2 [1,2, 3]  = true arr1 [1,2, 3] arr2
   * [1,4]  = false
   */

  public static boolean compare(int[] arr3, int[] arr4) {
    if (arr3.length != arr4.length) {
      return false;
    }
    for (int i = 0; i < arr3.length; i++) {
      if (arr3[i] != arr4[i]) {
        return false;
      }
    }
    return true;
  }

  /**
   * compare  elements  of arrays equality arr1 [1,3, 2] arr2 [1,2, 3]  = true arr1 [1,3, 2,1] arr2
   * [1,1, 2, 3]  = true      * arr1 [1,1, 2,3] arr2 [1,1, 2, 3]  = true arr1 [1,2, 3] arr2 [1,4]  =
   * false
   */

  public static boolean compareElements(int[] arr1, int[] arr2) {

    Arrays.sort(arr1);
    Arrays.sort(arr2);
    return compare(arr1, arr2);
  }


  public static int[] copy(int[] arr1, int start, int end) {
    int[] result = new int[end - start + 1];
    for (int i = 0; i < result.length; i++) {
      result[i] = arr1[i + start];
    }

    return result;
  }

  //test sample for sort
  public static int[] sorting(int[] arr1) {
    boolean wasChanged = true;
    int a;
    while (wasChanged) {
      wasChanged = false;

      for (int i = 0; i < arr1.length - 1; i++) {
        if (arr1[i] > arr1[i + 1]) {
          swap(arr1, i, i + 1);
          wasChanged = true;
        }
      }
    }
    return arr1;
  }

  public static void swap(int[] arr1, int a1, int a2) {
    int a;
    a = arr1[a2];
    arr1[a2] = arr1[a1];
    arr1[a1] = a;
  }

  /**
   * @param arr1 array to search
   * @param searchNumber number to search
   * @return return position of searchNumber or return -1 if can't fnd it
   */
  public static int search(int[] arr1, int searchNumber) {
    for (int i = 0; i < arr1.length; i++) {
      if (arr1[i] == searchNumber) {
        return i;
      }
    }
    return -1;
  }


  /**
   * @param arr1 array to search
   * @param searchNumber number to search
   * @return return position of searchNumber or return -1 if can't find it
   */
  public static int binarySearch(int[] arr1, int searchNumber) {
    if (arr1 == null || arr1.length == 0) {
      return -1;
    }
    return binarySearch(sorting(arr1), searchNumber, 0, arr1.length - 1);
  }

  // [1, 2, 3,4 ,5,6, 7,8  ]  min =0 , max 3, sear  = 4
  private static int binarySearch(int[] arr1, int searchNumber, int min, int max) {
    int mid = (max + min) / 2;
    if (arr1[mid] == searchNumber) {
      return mid;
    }
    if (min == max) {
      return -1;
    }
    if (arr1[mid] > searchNumber) {
      return binarySearch(arr1, searchNumber, min, mid - 1);
    } else {
      return binarySearch(arr1, searchNumber, mid + 1, max);
    }

  }

  /**
   * reverse arrays exm :  [1,2,3] exp : [3,2,1];
   */
  public static int[] reverse(int[] arr1) {
    int[] arr2 = new int[arr1.length];
    for (int i = 0; i < arr1.length; i++) {
      arr2[arr1.length - i - 1] = arr1[i];
    }
    return arr2;
  }

  /**
   * @param arr1 given array
   * @param find find element
   * @param replace change to
   * @return return result
   */
  public static int[] replace(int[] arr1, int find, int replace) {
    for (int i = 0; i < arr1.length; i++) {
      if (arr1[i] == find) {
        arr1[i] = replace;
      }
    }
    return arr1;
  }





}

