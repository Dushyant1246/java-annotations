package com.bridgelabz.pendingTask;

public class Calculator {
    @ToDo(task = "Add two numbers", assignedTo = "Jhon", priority = "LOW")
    public int add(int a, int b){
        return 0;
    }

    @ToDo(task = "Subtract from a number", assignedTo = "Kim")
    public int subtract(int a, int b){
        return 0;
    }

    @ToDo(task = "Divide a number by another", assignedTo = "Jerry", priority = "HIGH")
    public int divide(int a, int b){
        return 0;
    }

    public int multiply(int a, int b){
        return a * b;
    }
}
