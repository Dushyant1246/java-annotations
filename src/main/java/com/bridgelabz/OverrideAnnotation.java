package com.bridgelabz;

public class OverrideAnnotation{
    public static void main( String[] args ){
        Animal dog = new Dog();
        dog.makeSound();
    }
}

class Animal{
    void makeSound(){
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal{
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}