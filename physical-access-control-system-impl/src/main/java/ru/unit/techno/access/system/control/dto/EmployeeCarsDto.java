package ru.unit.techno.access.system.control.dto;

import lombok.Data;
import ru.unit.techno.access.system.control.entity.Car;
import ru.unit.techno.access.system.control.entity.Employee;

@Data
public class EmployeeCarsDto {

    private Car car;
    private Employee employee;
}
