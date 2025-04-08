package com.bridgelabz.fieldValidation;

import java.lang.reflect.Field;

public class User {
    @MaxLength(10)
    private String username;

    User(String username){
        Class<User> cls = User.class;
        Field usernameField;
        try {
            usernameField = cls.getDeclaredField("username");
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
        int maxLength = usernameField.getAnnotation(MaxLength.class).value();

        if (maxLength < username.length())
            throw new IllegalArgumentException("Username exceeds the limit of " + maxLength);

        this.username = username;
    }

    public void printUser(){
        System.out.println("User: " + username);
    }
}
