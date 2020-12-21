package ru.unit.techno.access.system.control.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table (name = "employees")
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

    @Column (name = "personal_number")
    private Long personalNumber;

    @OneToMany (mappedBy = "employee_id", fetch = FetchType.EAGER)
    @ToString.Exclude
    private List<Car> carsList;

    @OneToMany (mappedBy = "employee_id", fetch = FetchType.EAGER)
    @ToString.Exclude
    private List<Order> orderList;
}
