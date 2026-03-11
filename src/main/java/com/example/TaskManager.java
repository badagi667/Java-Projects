package com.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(String title, String desc, LocalDateTime dueDate) {
        tasks.add(new Task(title, desc, dueDate));
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks added yet.");
            return;
        }
        tasks.forEach(System.out::println);
    }

    public void markTaskCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markCompleted();
        } else {
            System.out.println("Invalid task index.");
        }
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public List<Task> getDueTasks() {
        List<Task> dueTasks = new ArrayList<>();
        LocalDateTime now = LocalDateTime.now();
        for (Task task : tasks) {
            if (!task.isCompleted() && !task.getDueDate().isAfter(now)) {
                dueTasks.add(task);
            }
        }
        return dueTasks;
    }


}
