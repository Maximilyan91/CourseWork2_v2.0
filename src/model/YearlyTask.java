package model;

import java.time.LocalDate;

public class YearlyTask extends Task{
    public YearlyTask(String title, String description, Type type) {
        super(title, description, type);
    }

    @Override
    public LocalDate getNextDateTask() {
        return getDateTime().toLocalDate().plusYears(1);
    }
}
