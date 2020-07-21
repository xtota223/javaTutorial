package com.sheroz.chapter7.hw;

public  abstract class Animal extends Object{
    String picture ;
    String food;
    Integer hunger;
    String boundary;
    String location ;


    void makeNoise () {
        System.out.println( "make noise :" + hunger );
    }

    abstract void type() ;
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

    int  roam(int i){
        return 1;
    }

    @Override
    void type() {
        System.out.println(  "Feline");
    }
}

class Lion extends Feline{

    @Override
    void eat() {

    }

    @Override
    void makeNoise() {
        //super.makeNoise();
        System.out.println("lion noise");

    }
}

class Tiger extends Feline {

}