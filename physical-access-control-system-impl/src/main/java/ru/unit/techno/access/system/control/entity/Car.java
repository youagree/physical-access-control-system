package ru.unit.techno.access.system.control.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "cars")
@SequenceGenerator(name = "squd_car_id_seq", sequenceName = "squd_car_id_seq")
public class Car {
    @Id
    @Column(name = "car_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "squd_car_id_seq")
    private Long id;

    //todo Подумать над типом и названием
    @Column(name = "rfid_information")
    private Long rfidInformation;

    @Column(name = "order_number")
    private Integer orderNumber;

    @Column(name = "car_on_the_territory")
    private Boolean carOnTheTerritory;
}
