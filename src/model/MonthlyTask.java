package model;

import java.time.LocalDate;

public class MonthlyTask extends Task{

    public MonthlyTask(String title, String description, Type type) {
        super(title, description, type);
    }

    @Override
    public LocalDate getNextDateTask() {
        return getDateTime().toLocalDate().plusMonths(1);
    }


}
