package com.sheroz.game.box15;

public class Box15Test {

  public static void main(String[] args) {
    Box15 game = new Box15(4);
    game.printMe();
    System.out.println("preparing number ");

    game.prepareNumber();
    game.printMe();
    System.out.printf(" can change : " + game.swap(2, 3, 3,3 ));
    System.out.printf(" can change : " + game.swap(0, 3, 3,3 ));
    game.printMe();


  }

}
