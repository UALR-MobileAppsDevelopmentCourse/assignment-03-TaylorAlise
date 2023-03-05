package com.ualr.simpletasklist.model;

public class Task {




    // TODO 01. Define two attributes for the Task class: one to store the task description and a second one that
    //  indicates whether the task is done or not
    String taskDescription;
    boolean taskCheck;
    
    // TODO 02. Define the class constructor and the corresponding getters and setters.
    //DESCRIPTION
    public Task(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    //DONE OR NOT
    public Task(boolean taskCheck) {
        this.taskCheck = taskCheck;
    }

    public boolean isTaskCheck() {
        return taskCheck;
    }

    public void setTaskCheck(boolean taskCheck) {
        this.taskCheck = taskCheck;
    }



}
