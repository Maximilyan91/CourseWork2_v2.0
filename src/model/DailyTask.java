package model;

import java.time.LocalDate;

public class DailyTask extends Task{
    public DailyTask(String title, String description, Type type) {
        super(title, description, type);
    }

    @Override
    public LocalDate getNextDateTask() {
        return getDateTime().toLocalDate().minusDays(1);
    }
}
