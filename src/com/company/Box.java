package com.company;

public class Box <T, N extends Number>{
private T number1;
private N number2;

    public Box(T number1, N number2) {
        this.number1 = number1;
        this.number2 = number2;
    }


    public T getNumber1( T number) {
        return number1;
    }

    public N getNumber2(N number) {
        return number2;
    }

}


