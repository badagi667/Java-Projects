package com.example;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.List;

public class App {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        try (Scanner scanner = new Scanner(System.in)) {
            Thread reminderThread = new Thread(() -> {
            while (true) { 
                List<Task> dueTasks = manager.getDueTasks();
                if (!dueTasks.isEmpty()) {
                    System.out.println("\n🔔 REMINDER: You have tasks due!");
                    dueTasks.forEach(System.out::println);
                }
                try {
                    Thread.sleep(5000); 
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        });
        reminderThread.setDaemon(true);
        reminderThread.start();

        while (true) {
            System.out.println("\n1. Add Task\n2. List Tasks\n3. Complete Task\n4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Title: "); String title = scanner.nextLine();
                    System.out.print("Description: "); String desc = scanner.nextLine();
                    LocalDateTime due = LocalDateTime.now().plusSeconds(10); // for testing quick reminders
                    manager.addTask(title, desc, due);
                    break;
                case 2:
                    manager.listTasks();
                    break;
                case 3:
                    System.out.print("Task index to complete: "); int idx = scanner.nextInt();
                    manager.markTaskCompleted(idx);
                    break;
                case 4:
                    System.out.println("Exiting..."); return;
                default:
                    System.out.println("Invalid choice.");
            }
            }
        }
    }
}
