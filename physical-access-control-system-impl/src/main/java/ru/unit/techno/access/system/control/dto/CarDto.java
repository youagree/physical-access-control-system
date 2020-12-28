package ru.unit.techno.access.system.control.dto;

import lombok.Data;

@Data
public class CarDto {

    private Long id;
    private Long rfidInformation;
    private Integer orderNumber;
    private Boolean carOnTheTerritory;
}
