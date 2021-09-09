package com.sheroz.game.box15;
import java.util.Random;


public class Box15 {
  private final int[][] gameBox;
  private int steps = 0;
  private int emptyPosX0 ;
  private int emptyPosX1 ;

  public Box15(int size) {
    gameBox = new int[size][size];
  }

  public void printMe() {
    for (int[] v1 : gameBox) {
      for (int data : v1) {
        System.out.print(data + "  ");
      }
      System.out.println("");
    }
  }

  public void prepareNumber() {
    int start = 1;
    for (int i = 0; i < gameBox.length; i++) {
      for (int j = 0; j < gameBox[i].length; j++) {
        gameBox[i][j] = start++;
      }
    }
    gameBox[gameBox.length - 1][gameBox.length - 1] = 0;
  }

  public void randomize() {
    int size = gameBox.length;
    Random rand = new Random();
    int x0, x1, y0, y1;
    for (int i = 0; i < 100; i++) {
      x0 = rand.nextInt(size);
      x1 = rand.nextInt(size);
      y0 = rand.nextInt(size);
      y1 = rand.nextInt(size);
      swap(x0, x1, y0, y1);
    }
  }

  public void start() {
    prepareNumber();
    randomize();
  }

  /*
    check if one of element equal to 0
   */
  public boolean canSwap(int x0, int x1, int y0, int y1) {
    if (x0 <0 || x1<0 ) return false;
    if (x0>= gameBox.length || x1>= gameBox.length ) return false;
    if (gameBox[x0][x1]==0){
      if (x0-y0 == +-1||x1-y1 == +-1){
        return true;
      }
    }
    else if (gameBox[y0][y1]==0) {
      if (x0 - y0 == +-1 || x1 - y1 == +-1) {
        return true;
      }
    }
    return false;
  }


  /*
   check if one of element equal to 0
  */
  public boolean canSwap(String direction ) {
    int x1=emptyPosX1 , x0=emptyPosX0;
    switch (direction) {
      case "up": x0--;
        break;
      case "down": x0++;
        break;
      case "left" : x1--;
        break;
      case "right": x1++;
        break;
    }
    return canSwap(x0,x1, emptyPosX0, emptyPosX1   );
  }



  public void swap(int x0, int x1, int y0, int y1) {
    int tmp = gameBox[x0][x1];

    gameBox[x0][x1] = gameBox[y0][y1];
    gameBox[y0][y1] = tmp;
    if (gameBox[y0][y1]==0) {
      emptyPosX0=y0;
      emptyPosX1=y1;
    }
    if (gameBox[x0][x1]==0) {
      emptyPosX0=x0;
      emptyPosX1=x1;
    }
  }

  public void swap(String direction) {
    int x1=emptyPosX1 , x0=emptyPosX0;
    switch (direction) {
      case "up": x0--;
        break;
      case "down": x0++;
        break;
      case "left" : x1--;
        break;
      case "right": x1++;
        break;
    }
    swap(x0,x1, emptyPosX0, emptyPosX1   );
  }


  /*
    check if elements  in order  except last one
   */
  public boolean IsEndOfTheGame() {
    int count=1;
    for (int[] box : gameBox) {
      for (int j = 0; j < gameBox.length; j++) {
        if (box[j] == count) {
          count++;
        } else {
          return false;
        }
      }
    }

    return count - 1 == (gameBox.length * gameBox.length - 1);
  }
}

