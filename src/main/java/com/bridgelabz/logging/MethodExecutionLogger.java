package com.bridgelabz.logging;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodExecutionLogger {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Class<Calculator> cls = Calculator.class;
        for (Method method: cls.getDeclaredMethods()){
            if (method.isAnnotationPresent(LogExecutionTime.class)){
                for (int i = 0 ; i < 5 ; i++) method.invoke(null, 10, 10);
                long time = System.nanoTime();
                method.invoke(null, 10, 10);
                System.out.println("Time taken for " + method.getName() + " is " + ((System.nanoTime() - time)/1_000_000.0) + " ms");
            }
        }
    }
}