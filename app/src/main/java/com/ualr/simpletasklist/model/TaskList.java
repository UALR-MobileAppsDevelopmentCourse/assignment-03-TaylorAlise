package com.ualr.simpletasklist.model;

import android.app.ActivityManager;

import androidx.appcompat.view.menu.MenuBuilder;
import com.ualr.simpletasklist.model.Task;

import java.util.HashMap;
import android.view.View;

public class TaskList {
    TaskList = new HashMap<>();


    // TODO 03. Define TaskList's attributes. The class will have just one attribute to store all
    //  the tasks created by the user.
    String tasksCreated;
    String taskDescription;
    boolean taskCheck;


// TIP. We need a data structure able to dynamically grow and shrink. That's why we'll use a HashMap.
    // where keys will be integer values and the mapped values will be a task object

    // TODO 04. Define the class constructor and the corresponding getters and setters.
    public TaskList(String tasksCreated) {

        this.tasksCreated = tasksCreated;
    }

    public String getTasksCreated() {

        return tasksCreated;
    }

    public void setTasksCreated(String tasksCreated) {
        this.tasksCreated = tasksCreated;
    }

    // TODO 06.03. Define a new method called "add" that, given a task description, will create a
    //  new task and add it to the task list.
    private void add(String taskDescription) {
        taskDescription = "";
        TaskList.put(taskDescription, new Task(tasksCreated));


    }
    // TODO 06.04. Define a new "toString" method that provides a formatted string with all the tasks in the task list.
    // Format: 1 line per task. Each line should start with the id number of the task, then a dash, and the task description right after that.
    // If the tasks is marked as done, "Done" should be included at the end of the line
    public String toString() {
        String formatted = "";
        String status;
        int i = this.tasksCreated.size();
        while (i != 0) {
            status = this.markDone(i);
            formatted += i.toString() + this.taskDescription(i) + "" + status + "\n";
        }
        return formatted;
    }

    // TODO 07.03. Define a new method called "delete" that, given a task id, will delete the
    //  corresponding task from the task list.
    private void delete(String tasksCreated) {
        TaskList.remove(taskDescription, new Task(tasksCreated));

    }

    // TODO 08.03. Define a new method called "markDone" that, given a task id, will mark the
    //  corresponding task as done.
    private void markDone(int id, String tasksCreated) {
        for (Task task) {
            if (Task.getId() == id){


            }
        }
    }
}