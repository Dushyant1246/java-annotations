package com.bridgelabz.repeatableAnnotation;

import java.lang.reflect.Method;

public class BugTracker {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<BugTracker> cls = BugTracker.class;
        Method method = cls.getMethod("testFunction");
        for (Bug bug: method.getAnnotationsByType(Bug.class)){
            System.out.println("Bug Description: " + bug.description());
        }
    }

    @Bug(description = "Null pointer exception")
    @Bug(description = "Array out of bounds exception")
    public void testFunction(){
        System.out.println("This is a test function");
    }
}
