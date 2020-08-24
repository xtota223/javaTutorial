package com.sheroz.HomeWorkSwith;
import java.util.Scanner;

//Exercise 3: Write a Java program that determines a student’s grade.
//
//        The program will read three types of scores(quiz, mid-term, and final
//scores) and determine the grade based on the following rules:
//        -if the average score >=90% =>grade=A
//        -if the average score >= 70% and <90% => grade=B
//        -if the average score>=50% and <70% =>grade=C
//        -if the average score<50% =>grade=F
//
//        See the example output below:
//
//        Quiz score: 80
//
//        Mid-term score: 68
//
//        Final score: 90
//
//        Your grade is B.

import java.util.Scanner;

public class HomeWork3 {
static Scanner sc = new Scanner(System.in);
public static void main(String[]args){
System.out.println("What is your grades?");

    System.out.print("Quiz score:");
  int q = sc.nextInt();
    System.out.print("Mid-term score:");
  int m = sc.nextInt();
    System.out.print("Final score:");
  int f = sc.nextInt();

  int average = (q + m + f)/3;
  String grade = null;

  if (average >=90){
      grade = "A";
  }
  else if (average>=70& average<90) {
      grade = "B";
  }
  else if (average >=50 & average < 70){
      grade = "C";
  }
  else if (average <50){
      grade = "D";
      }
  System.out.println("Your grade is "+grade);


    }



}
