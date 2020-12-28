package ru.unit.techno.access.system.control.entity;

import lombok.Data;
import ru.unit.techno.access.system.control.enums.OrderType;
import ru.unit.techno.access.system.control.enums.StatusType;

import javax.persistence.*;
import java.time.LocalDateTime;

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
    private LocalDateTime creationTime;

    @Column(name = "order_weight")
    private Double orderWeight;

    //todo Точно REAL weight?? Подумать.
    @Column(name = "real_weight")
    private Double realWeight;

    @Enumerated(EnumType.STRING)
    StatusType status;

    @Enumerated(EnumType.STRING)
    OrderType orderType;

    @OneToOne(cascade = CascadeType.ALL)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "weigher_process_id")
    private WeigherProcess weigherProcessId;
}
