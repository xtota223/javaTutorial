package com.sheroz.game.box15;
import java.util.Random;


public class Box15 {
  private final int[][] gameBox;
  private int steps=0 ;
  public Box15(int size ) {
    gameBox= new int[size][size];
  }

  public void printMe() {
    for (int[] v1: gameBox) {
      for (int data : v1) {
         System.out.print( data + "  " );
      }
      System.out.println( "" );
    }
  }

  public void prepareNumber () {
    int start= 1 ;
    for (int i=0 ; i< gameBox.length; i++ ) {
      for (int j=0 ; j<gameBox[i].length; j++  ) {
        gameBox[i][j]= start++;
      }
    }
    gameBox[gameBox.length-1][gameBox.length-1] = 0;
  }

  public void randomize() {
    Random rand = new Random();
    int i;
    i =rand.nextInt(15);
  }

  public void start() {
    prepareNumber();
    randomize();
  }

  public boolean swap(int x0, int x1 , int y0, int y1) {
    int a,b;
    a=x0;
    x0=x1;
    x1=a;

    b=y0;
    y0=y1;
    y1=b;
    return false;
  }

  public boolean isEndOfGame() {
    int start=1;
    int c=1;
    for (int i=0 ; i< gameBox.length; i++ ) {
      for (int j=0 ; j<gameBox[i].length; j++  ) {
        gameBox[i][j]= start++;
        if (start==c){
          c++;
        }
      }
    }
    gameBox[gameBox.length-1][gameBox.length-1] = 0;
    if (c==16){
      return true;
    }
    return false;
  }

}
