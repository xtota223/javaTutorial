package com.sheroz.game.box15;



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

  }

  public void start() {
    prepareNumber();
    randomize();
  }

  public boolean swap(int x0, int x1 , int y0, int y1) {
    return false;
  }

  public boolean isEndOfGame() {
    return false;
  }






}
