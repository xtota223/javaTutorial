package com.sheroz.chapter42;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrayhomework {
    public static void main (String []args){
        int[] n1 = new int[3];
        boolean[] n2  = new boolean[3];
        boolean[] n3  = new boolean[3];
        int[] n4 = new int[3];

        n1[0]= 5;
        n1[1]= 3;
        n4[0]=6;
        n4[1]=6;


    //Arrays.binarySearch(n1,3); error
    //Arrays.copyOf(new int[]{3},10); not working
    Arrays.copyOfRange(n1,0,10);
    //Arrays.deepEquals(n2,n3);
    Arrays.equals(n1,n4);
    Arrays.fill(n4,10);
    Arrays.fill(n4,2,3,9);
    Arrays.sort(n1);
    Arrays.sort(n4,2,3);
    Arrays.toString(n2);


        for(int i=0; i<= 3;i++){
    System.out.println("array 1:" +n1[i] + ", array 2: "+ n2[i] + ", array 3: "+ n3[i]+ ", array 4: "+ n4[i]);}

    }
}
