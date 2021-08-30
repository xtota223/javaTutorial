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
    int size = gameBox.length;
    Random rand = new Random();
    int x0, x1, y0,y1;
    for (int i=0; i<100; i++) {
      x0= rand.nextInt(size);
      x1= rand.nextInt(size);
      y0= rand.nextInt(size);
      y1= rand.nextInt(size);
      swap(x0,x1,y0,y1);
    }


  }

  public void start() {
    prepareNumber();
    randomize();
  }

  /*
    check if one of element equal to 0
   */
  public boolean canSwap(int x0, int x1 , int y0, int y1) {
    int a,b;
    a=x0;
    x0=x1;
    x1=a;

    b=y0;
    y0=y1;
    y1=b;
    return false;
  }

  public void  swap(int x0, int x1 , int y0, int y1) {
    int tmp= gameBox[x0][x1];
    gameBox[x0][x1]=gameBox[y0][y1];
    gameBox[y0][y1]=tmp;
  }

  /*
    check if elements  in order  except last one
   */
  public boolean isEndOfGame() {
    int start=1;
    int c=1;
    for (int i=0 ; i< gameBox.length; i++ ) {
      for (int j=0 ; j<gameBox[i].length; j++  ) {
        //gameBox[i][j]= start++;
        if (start==c){
          c++;
        }
      }
    }

    if (c==16){
      return true;
    }
     else return false;
  }
  
}
