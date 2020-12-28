package ru.unit.techno.access.system.control.dto;

import lombok.Data;
import ru.unit.techno.access.system.control.entity.Car;
import ru.unit.techno.access.system.control.entity.Order;

import java.util.List;

@Data
public class EmployeeDto {

    private Long id;
    private String name;
    private String surname;
    private Long personalNumber;
    private List<Car> carsList;
    private List<Order> orderList;
}
