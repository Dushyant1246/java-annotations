package com.bridgelabz.repeatableAnnotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReport.class)
public @interface Bug {
    String description();
}
