package ru.unit.techno.access.system.control.dto;

import lombok.Data;
import ru.unit.techno.access.system.control.entity.Order;

@Data
public class WeigherProcessDto {

    private Order id;
    private Long rfidInfo;
    private Double weightBefore;
    private Double weightAfter;
    private Double orderWeight;
}
