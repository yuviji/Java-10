package com.example;

public class Calculator {
    public int add(int x, int y){
        return x + y;
    }
    
    // This method could throw an ArithmeticException
    public double divide(int x, int y) {
        return x / y;
    }
}
