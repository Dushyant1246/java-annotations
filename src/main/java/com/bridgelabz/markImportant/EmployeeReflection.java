package com.bridgelabz.markImportant;

import java.lang.reflect.Method;

public class EmployeeReflection {
    public static void main(String[] args) {
        Class<Employee> cls = Employee.class;
        for (Method method: cls.getDeclaredMethods()){
            if (method.isAnnotationPresent(ImportantMethod.class)){
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println("Method: " + method.getName());
                System.out.println("Level: " + annotation.level() + "\n");
            }
        }
    }
}
