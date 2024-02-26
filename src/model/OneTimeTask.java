package model;

import java.time.LocalDate;

public class OneTimeTask extends Task{
    public OneTimeTask(String title, String description, Type type) {
        super(title, description, type);
    }

    @Override
    public LocalDate getNextDateTask() {
        return getDateTime().toLocalDate();
    }
}
