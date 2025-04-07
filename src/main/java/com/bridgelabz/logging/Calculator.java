package com.bridgelabz.logging;

public class Calculator {

    @LogExecutionTime
    public static int add(int a, int b){
        return a + b;
    }

    @LogExecutionTime
    public static int subtract(int a, int b){
        return a - b;
    }

    @LogExecutionTime
    public static int multiply(int a, int b){
        return a * b;
    }

    @LogExecutionTime
    public static int power(int a, int b){
        return (int) Math.pow(a, b);
    }
}
