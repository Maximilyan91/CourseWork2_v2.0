package model;

import java.time.LocalDate;

public class WeeklyTask extends Task{
    public WeeklyTask(String title, String description, Type type) {
        super(title, description, type);
    }


    public LocalDate getNextDateTask() {
        return getDateTime().toLocalDate().plusWeeks(1);
    }
}
