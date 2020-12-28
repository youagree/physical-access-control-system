package ru.unit.techno.access.system.control.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name ="weigher_process")
public class WeigherProcess {

    @Id
    @OneToOne (mappedBy = "weigherProcessId")
    private Order id;

    @Column(name = "rfid_info")
    private Long rfidInfo;

    @Column(name = "weight_before")
    private Double weightBefore;

    @Column(name = "weight_after")
    private Double weightAfter;

    @Column(name = "order_weight")
    private Double orderWeight;
}
