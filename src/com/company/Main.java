
package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    Box box1 = new Box <Number>(12,13);
    Box box2 = new Box <Float>(4.0f,5.6f);



    }



    public static double addition (List<? extends Number> list){
        double s = 0.0;
        Integer a = 9;
        for (Number n : list)
            s+= n.doubleValue();git
        return a;
        }
        List<Integer> li= Arrays.asList(1,2,3);

    public static double multiplication (List<? extends Number> list){
        double b = 0.0;
        for (Number n : list)
            b*= n.doubleValue();
        return b;
    }
    List<Integer> li1= Arrays.asList(1,2,3);
    }



