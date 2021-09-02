package com.sheroz.game.box15;

import java.util.Scanner;

public class BoxGame {

  public static void main(String[] args) {
    System.out.println( " press 'S' to start game or any other to exit  " );
    Scanner sc = new Scanner(System.in);
    String commnd =  sc.next();
    if (commnd.equalsIgnoreCase("s") ) {
      Box15 game = new Box15(4);
      game.start();
      game.printMe();

      while (!commnd.equalsIgnoreCase("q")) {
        commnd=  sc.next();
        if (game.canSwap(commnd)) {
          game.swap(commnd);
        }
        game.printMe();

      }

    }

  }

}
