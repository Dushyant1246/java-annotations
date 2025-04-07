package com.bridgelabz.markImportant;

public class Employee {
    private String name;
    private int age;

    @ImportantMethod(level = "NORMAL")
    void displayEmployee(){
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }

    @ImportantMethod
    void addDetails(String name, int age){
        this.name = name;
        this.age = age;
    }

    int getAge(){
        return age;
    }
}
