package com.springboot.practice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpaceShipDto {
    private Long id;
    private String name;
    private String model;
    private double speed;

}
