package com.sheroz.chapterN4;

public class HomeWork {

    public static void main(String[] args) {

        int x = 1;
        int y = 2;
        int c = 2;
        int d = 2;


        if (y != x) {
            System.out.println("its true that y is not equal to x");
        } else {
            System.out.println("y is equal to x");
        }


        if (c == (y | x)) {
            System.out.println("c is equal to one of the symbols");
        } else {
            System.out.println("non of them are correct");
        }


        if (d == (c & y)) {
            System.out.println("d is equal to both of them");
        }
        else System.out.println("d is equal to only one of them or to none of them");
    }
}




class HomeWork2 {

    public static void main(String[] args) {


        int x = 1;
        int y = 2;
        int c = 2;
        int d = 2;

        boolean first = true;
        boolean second = true;
        boolean third = false;


        if (first == (second  ^ third)) {
            System.out.println("c in equal to only  one of them");
        } else {
            System.out.println("c is equal to both of them or to none of them");
        }




         if (first == (third && second)) {
          System.out.println("true");}

          else{
          System.out.println("false");
          }



          if (first == (second || third)){System.out.println("true");}
          else System.out.println("false");


        }
    }























