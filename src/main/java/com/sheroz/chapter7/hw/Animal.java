package com.sheroz.chapter7.hw;

public class Animal {
    String picture ;
    String food;
    Integer hunger;
    String boundary;
    String location ;


    void makeNoise () {
        System.out.println( "make noise :" + hunger );
    }
    void eat () {
        System.out.println( "eat : " + food );
    }
    void  sleep(){
        System.out.println( "sleep");
    }
    void roam() {
        System.out.println("alone");
    }

}

class Feline extends Animal {
    @Override
    void roam() {
        super.roam();
    }
}

class Lion extends Feline{
    @Override
    void makeNoise() {
        super.makeNoise();{System.out.print("lion noise");
            void eat()

        }
}
}

class Tiger extends Feline {

}