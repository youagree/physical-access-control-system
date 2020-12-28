package ru.unit.techno.access.system.control.enums;

public enum OrderType {
    FILL("Заливка"), //todo Переделать на заводские названия
    BAGS("Мешки");

    private String orderType;

    OrderType(String orderType) {
        this.orderType = orderType.toUpperCase();
    }

    public String getOrderType() {
        return orderType;
    }
}
