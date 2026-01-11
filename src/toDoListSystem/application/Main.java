package toDoListSystem.application;

import toDoListSystem.model.entities.Task;
import toDoListSystem.model.entities.ToDoList;
import toDoListSystem.model.exception.DomainException;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ToDoList toDoList = new ToDoList();
        int option = -1;
        while(option != 0){
            System.out.println("To-Do-List by NardoDev:");
            System.out.println("1 - Create a task");
            System.out.println("2 - Mark as done");
            System.out.println("3 - Delete a task");
            option = sc.nextInt();
            sc.nextLine();

            switch (option){
                case 1:
                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Description: ");
                    String description = sc.nextLine();

                    Random random = new Random();
                    int id = random.nextInt(900000) + 100000;
                    System.out.println("ID: " + id);

                    Task task = new Task(name, id, description);

                    toDoList.createTask(task);
                    break;

                case 2:
                    System.out.print("Enter task id: ");
                    id = sc.nextInt();
                    sc.nextLine();

                    try{
                        task = toDoList.findById(id);
                        task.updateStatus();
                        System.out.println("Task completed and registered.");

                    } catch (DomainException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.print("Enter task id: ");
                    id = sc.nextInt();
                    sc.nextLine();

                    try {
                        toDoList.deleteById(id);
                        System.out.println("Deleted.");
                    } catch (DomainException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                default:
                    System.out.print("Option invalid.");
            }
        }
    }
}