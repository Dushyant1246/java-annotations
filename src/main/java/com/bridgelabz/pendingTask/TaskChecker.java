package com.bridgelabz.pendingTask;

import java.lang.reflect.Method;

public class TaskChecker {
    public static void main(String[] args) {
        Class<Calculator> cls = Calculator.class;
        for (Method method: cls.getMethods()){
            if (method.isAnnotationPresent(ToDo.class)){
                ToDo annotation = method.getAnnotation(ToDo.class);
                System.out.println("Method: " + method.getName());
                System.out.println("Task: " + annotation.task());
                System.out.println("Priority: " + annotation.priority() + "\n");
            }
        }
    }
}
