package com.sheroz.chapterN4;


import java.util.Scanner;

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
        int number= (int) (Math.random()*100);
        Scanner sc = new Scanner(System.in);
        int oldNumberDifferent  = -100;
        do{
            System.out.println("Inter number from 0 to 100" );
            int i =  sc.nextInt();
            int newNumberDifferent = Math.abs(number - i);

            if (i<0 || i>100 ) {
                System.out.println("Wrong range of number ");
            }
            else if ( i== number) {
                System.out.println( "Win, you find right number ");
                System.out.println("Exit");
                break;
            }
            else  if (newNumberDifferent > oldNumberDifferent ) {
                System.out.println("Cold" );

            }
            else  {
                System.out.println("Hot" );
            }
            oldNumberDifferent= newNumberDifferent;
        }
        while (true);


    }


//        int x = 1;
//        int y = 2;
//        int c = 2;
//        int d = 2;
//
//        boolean first = true;
//        boolean second = true;
//        boolean third = false;
//
//        Scanner
//
//        if(x==1  && y==2 ) {
//            System.out.println( "x=1 and y=2");
//        }
//
//        if (first == (second  ^ third)) {
//            System.out.println("c in equal to only  one of them");
//        } else {
//            System.out.println("c is equal to both of them or to none of them");
//        }
//
//
//
//
//         if (first == (third && second)) {
//          System.out.println("true");}
//
//          else{
//          System.out.println("false");
//          }
//
//
//
//          if (first == (second || third)){System.out.println("true");}
//          else System.out.println("false");
//
//
//        }
    }























