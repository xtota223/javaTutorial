package com.sheroz.game.box15;
import java.util.Random;


public class Box15 {
  private final int[][] gameBox;
  private int steps = 0;

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





  public void swap(int x0, int x1, int y0, int y1) {
    int tmp = gameBox[x0][x1];
    gameBox[x0][x1] = gameBox[y0][y1];
    gameBox[y0][y1] = tmp;
  }

  /*
    check if elements  in order  except last one
   */
  public boolean IsEndOfTheGame() {
    int count=1;
    for (int i=0;i<gameBox.length;i++){
      for (int j =0;j<gameBox.length;j++){
        if (gameBox[i][j] == count)
          count++;
        }
      }
    if (count-1 == gameBox[gameBox.length-1][gameBox.length-2] && gameBox[gameBox.length-1][gameBox.length-1] ==0){
      return true;
    }
    return false;
  }
}

