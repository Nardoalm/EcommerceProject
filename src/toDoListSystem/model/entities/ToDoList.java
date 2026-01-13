package toDoListSystem.model.entities;

import toDoListSystem.model.exception.DomainException;

import java.util.ArrayList;

public class ToDoList {
    private ArrayList<Task> tasks = new ArrayList<>();

    public void createTask(Task task){
        tasks.add(task);
    }

    public Task findById(int id) throws DomainException {
        for(Task task : tasks){
            if(task.getId() == id){
                return task;
            }
        }
        throw new DomainException("Task not found.");
    }

    public void deleteById(int id){
        Task toDelete = null;
        for(Task task : tasks){
            if(task.getId() == id){
                toDelete = task;
            }
        }
        tasks.remove(toDelete);
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }
}
