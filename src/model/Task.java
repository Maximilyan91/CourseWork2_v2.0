package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Task {

    private static int idGenerator = 0;

    private String title;

    private String description;

    private final Type type;

    private final int id;

    private final LocalDateTime dateTime;

    public Task(String title, String description, Type type) {
        this.title = title;
        this.description = description;
        this.type = type;
        this.id = ++idGenerator;
        this.dateTime = LocalDateTime.now();
    }

    public abstract LocalDate getNextDateTask();

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Type getType() {
        return type;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task task)) return false;
        return id == task.id && Objects.equals(title, task.title) && Objects.equals(description, task.description) && type == task.type && Objects.equals(dateTime, task.dateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, description, type, id, dateTime);
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", type=" + type +
                ", id=" + id +
                ", dateTime=" + dateTime +
                '}';
    }
}


