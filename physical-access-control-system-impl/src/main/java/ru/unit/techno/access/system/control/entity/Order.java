package ru.unit.techno.access.system.control.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "orders")
@SequenceGenerator(name = "squd_order_id_seq", sequenceName = "squd_order_id_seq")
public class Order {
    private static enum status_types {created, in_progress, done, canceled}

    @Id
    @Column(name = "order_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "squd_order_id_seq")
    private Long id;

    @Column(name = "creation_time")
    private Timestamp creationTime;

    @Column(name = "order_weight")
    private Double orderWeight;

    //todo Точно REAL weight?? Подумать.
    @Column(name = "real_weight")
    private Double realWeight;

    @Enumerated (EnumType.STRING)
    status_types status;

}
