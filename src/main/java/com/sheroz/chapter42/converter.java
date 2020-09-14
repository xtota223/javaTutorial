package com.sheroz.chapter42;
import java.util.Scanner;

public class converter {
    static Scanner sc = new Scanner(System.in);
    public static void main (String []args){
        String inp = sc.nextLine();

        int x;
        if(inp.contains("a"));
        {
            inp = inp.replace("a", "0");
            x = 0;
        }
         if ( inp.contains("b")){
            inp = inp.replace("b", "1");
            x = 1;
        }
        else if ( inp.contains("c")){
            inp = inp.replace("c", "2");
            x = 2;

        }
        else if ( inp.contains("d")){
            inp = inp.replace("d", "3");
            x = 3;

        }
        else if ( inp.contains("e")){
            inp = inp.replace("e", "4");
            x = 4;

        }
        else if ( inp.contains("f")){
            inp = inp.replace("f", "5");
            x = 5;

        }
        else if ( inp.contains("g")){
            inp = inp.replace("g", "6");
            x = 6;

        }
        else if ( inp.contains("h")){
            inp = inp.replace("h", "7");
            x = 7;

        }
        int y;

        if( inp.contains("0"));
        {
            y = 0;
        }
         if ( inp.contains("1")){
            y = 1;
        }
        else if ( inp.contains("2")){
            y = 2;

        }
        else if ( inp.contains("3")){
            y = 3;

        }
        else if ( inp.contains("4")){
            y = 4;

        }
        else if ( inp.contains("5")){
            y = 5;

        }
        else if ( inp.contains("6")){
            y = 6;

        }
        else if ( inp.contains("7")){
            y = 7;

        }


        System.out.println("input is: "+inp + "    x is:  " + x+ "   y is :  "+ y);



    //    int x = inp;
    //    int y = sc.nextInt();

     //   int coInp =(x,y)

     System.out.println(inp);

  //  }

//void convert (int x , int y){


    }
}
