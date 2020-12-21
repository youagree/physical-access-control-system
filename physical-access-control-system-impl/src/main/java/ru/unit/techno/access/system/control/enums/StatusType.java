package ru.unit.techno.access.system.control.enums;

public enum StatusType {
    CREATED("создано"),
    IN_PROGRESS("в процессе"),
    DONE("готово"),
    CANCELED("отменен");

    private String status;

    StatusType(String status) {
        this.status = status.toUpperCase();
    }

    public String getStatus() {
        return status;
    }
}