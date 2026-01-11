package toDoListSystem.model.entities;

import toDoListSystem.model.enums.TaskStatus;

public class Task {
    private final String nameTask;
    private final int id;
    private TaskStatus status;
    private final String description;

    public Task(String nameTask, int id, String description){
        this.nameTask = nameTask;
        this.id = id;
        this.description = description;
    }

    public void updateStatus() {
        status = TaskStatus.COMPLETED;
    }

    public int getId() {
        return id;
    }
}
