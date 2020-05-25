package com.hairdresser.Model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDto {
    private Long id;
    private String name;
    private String lastName;
    private String phone;
    private String barberName;
    private String HairdresserService;
    private LocalDateTime createData;
    private LocalDateTime visitData;
}
