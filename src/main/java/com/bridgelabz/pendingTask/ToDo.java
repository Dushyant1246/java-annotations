package com.bridgelabz.pendingTask;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ToDo {
    String task();
    String assignedTo();
    String priority() default "MEDIUM";
}
