package ru.unit.techno.access.system.control.dto;

import lombok.Data;
import ru.unit.techno.access.system.control.entity.WeigherProcess;
import ru.unit.techno.access.system.control.enums.StatusType;

import java.time.LocalDateTime;

@Data
public class OrderDto {

    private Long id;
    private LocalDateTime creationTime;
    private Double orderWeight;
    private Double realWeight;
    private StatusType status;
    private WeigherProcess weigherProcessId;
}
