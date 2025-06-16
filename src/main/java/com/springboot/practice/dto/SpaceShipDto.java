package com.springboot.practice.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpaceShipDto {
    private Long id;
    @NotBlank(message = "Name is required")
    private String name;
    @NotBlank(message = "Model is required")
    private String model;
    @NotBlank(message = "Speed must be positive")
    @Positive
    private double speed;

}
