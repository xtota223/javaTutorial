package com.sheroz.chapter43;
import java.util.ArrayList;
import java.util.List;
public class hw {
    public static void main(String[] args) {

        ArrayList<String> signs= new ArrayList<String>();
        signs.add("Drink pepsi");
        signs.add("NO minors allowed");
        signs.add("Say pepsi,please");
        signs.add("7-up: You LIke It, It Likes You");
        signs.add("Dr.Pepper 10, 2, 4");
        System.out.println(signs);
        System.out.println("---------------");
        signs.set(0,"One");
        signs.set(1,"Two");
        signs.set(2,"Three");
        System.out.println(signs);
    }
}

