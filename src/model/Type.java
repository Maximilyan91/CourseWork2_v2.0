package model;

public enum Type {

    WORK("рабочая"),
    PERSONAL("персональная")
    ;
    private final String taskType;


    Type(String taskType) {
        this.taskType = taskType.toLowerCase();
    }

    public String getTaskType() {
        return taskType;
    }
}
