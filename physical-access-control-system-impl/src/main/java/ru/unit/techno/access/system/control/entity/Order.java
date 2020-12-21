package ru.unit.techno.access.system.control.entity;

import lombok.Data;
import ru.unit.techno.access.system.control.enums.StatusType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Data
@Table(name = "orders")
@SequenceGenerator(name = "squd_order_id_seq", sequenceName = "squd_order_id_seq")
public class Order {

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

    @Enumerated(EnumType.STRING)
    StatusType status;
}
