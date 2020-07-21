package com.sheroz.chapter7.hw;

public class Mixed2 {
    public static void main (String [] args) {
        checkAnimal();
        System.out.println("================");

        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();

        a2.m1();
        a2.m2();
        a2.m3();
    }

    public static  void checkAnimal(){

        Lion lion= new Lion();
        lion.makeNoise();

        Tiger tiger= new Tiger();
        tiger.hunger= 3;
        tiger.food= " Beef";

        tiger.makeNoise();
        tiger.eat();



    }
}
