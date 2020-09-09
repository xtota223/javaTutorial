package com.sheroz.chapter42;

public class ChessBoard {

  public static void main(String[] args) {

    new ChessBoard().findPoz( 4, 4  );
  }

  void findPoz(int x , int y) {
      canIjump(x-2 , y+1);
      canIjump(x-2 , y-1);
      canIjump(x+2 , y+1);
      canIjump(x+2 , y-1);
    canIjump(x+1 , y-2);
    canIjump(x-1 , y-2);
    canIjump(x+1 , y+2);
    canIjump(x-1 , y+2);


  }

  void canIjump(int x , int y) {
    if  ((x>=0 && x<=7) && (y>=0 && y<=7)) {
      String lt= "";
      switch (x) {
        case 0:
          lt="a";
          break;
        case 1:
          lt="b";
          break;
        case 2:
          lt="c";
          break;
        case 3:
          lt="d";
          break;
        case 4:
          lt="e";
          break;
        case 5:
          lt="f";
          break;
        case 6:
          lt="g";
          break;
        case 7:
          lt="h";
          break;

      }

      System.out.println( lt +  y );
    }
  }

}
