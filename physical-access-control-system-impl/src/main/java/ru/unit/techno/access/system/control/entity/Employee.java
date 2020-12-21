package ru.unit.techno.access.system.control.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.List;

@Entity
@Data
@Table(name = "employee")
@SequenceGenerator(name = "squd_employee_id_seq", sequenceName = "squd_employee_id_seq")
public class Employee {
    @Id
    @Column(name = "employee_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "squd_employee_id_seq")
    private Long id;

    @Column
    private String name;

    @Column
    private String surname;

    @Column(name = "personal_number")
    private Long personalNumber;

    @OneToMany(mappedBy = "employee_id", fetch = FetchType.EAGER)
    @ToString.Exclude
    private List<Car> carsList;

    @OneToMany(mappedBy = "employee_id", fetch = FetchType.EAGER)
    @ToString.Exclude
    private List<Order> orderList;
}
