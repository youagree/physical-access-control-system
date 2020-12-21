package ru.unit.techno.access.system.control.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Embeddable
public class EmployeesCars {
    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
