package toDoListSystem.model.entities;

import toDoListSystem.model.enums.TaskStatus;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task {
    private final String nameTask;
    private final int id;
    private TaskStatus status;
    private final String description;
    private LocalDateTime moment;
    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    public Task(String nameTask, int id, String description, LocalDateTime moment){
        this.nameTask = nameTask;
        this.id = id;
        this.description = description;
        this.moment = moment;

        status = TaskStatus.PENDING;
    }

    public void updateStatus() {
        status = TaskStatus.COMPLETED;
    }

    public int getId() {
        return id;
    }

    public String getNameTask() {
        return nameTask;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getMoment() {
        return moment;
    }

    public String getMomentFormatted(){
        return moment.format(fmt);
    }

    @Override
    public String toString(){
        return "Task data:" +
                "\nName: " +
                getNameTask() +
                "\nDescription: " +
                getDescription() +
                "\nId: " +
                getId() +
                "\nStatus: " +
                getStatus() +
                "\nMoment: " +
                getMomentFormatted();
    }
}
