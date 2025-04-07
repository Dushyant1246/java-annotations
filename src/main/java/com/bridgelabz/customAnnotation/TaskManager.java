package com.bridgelabz.customAnnotation;

import java.lang.reflect.Method;

public class TaskManager {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<TaskManager> taskManagerClass = TaskManager.class;
        Method method = taskManagerClass.getMethod("task");
        TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);
        System.out.println("Method: " + method.getName());
        System.out.println("Priority: " + taskInfo.priority());
        System.out.println("Assigned To: " + taskInfo.assignedTo());
    }

    @TaskInfo(priority = 4, assignedTo = "Jhon")
    public static void task(){
        System.out.println("This is an annotated task");
    }
}
