package com.bridgelabz.fieldValidation;

public class FieldValidation {
    public static void main(String[] args){
        User user = new User("hello this is my username");  //throws IllegalArgumentException as length is more than 10
        user.printUser();
    }
}
