
package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Box box1 = new Box<Double, Integer>(15.1, 13);
        Box box2 = new Box<Float, Float>(4.0f, 5.6f);


    }

    public static void addition(Box<? extends Double, ? extends Integer> box1, Box<? extends Float, Float> box2) {

        Number ad = box1.getNumber1() + box1.getNumber2() + box2.getNumber2() + box2.getNumber1();
        System.out.println(ad);

    }

    public static void multiplication(Box<? extends Double,? extends Integer> box1, Box<? extends Float, Float> box2) {
        Number mu = box1.getNumber1() * box1.getNumber2() * box2.getNumber2() * box2.getNumber1();
        System.out.println(mu);


    }
}





