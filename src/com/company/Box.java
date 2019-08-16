package com.company;

public class Box <T extends Number, N extends Number>{
private T number1;
private N number2;

    public Box(T number1, N number2) {
        this.number1 = number1;
        this.number2 = number2;
    }


    public T getNumber1() {
        return number1;
    }

    public N getNumber2() {
        return number2;
    }

}


