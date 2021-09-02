package com.sheroz.game.box15;

public class Box15Test {

  public static void main(String[] args) {
    Box15 game = new Box15(4);
    game.printMe();
    System.out.println("preparing number ");

    game.prepareNumber();
    game.printMe();
    System.out.println(" can change : " + game.canSwap(2, 2, 3,3 ));
    System.out.println(" can change : " + game.canSwap(0, 3, 3,3 ));
    System.out.println();
    System.out.println( "is end of game:  " + game.IsEndOfTheGame() );
    game.printMe();
    System.out.println("Start game ");
    game.start();
    System.out.println( "is end of game:  " + game.IsEndOfTheGame() );
    game.printMe();
  }

}
