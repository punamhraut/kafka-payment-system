package com.example.carapi.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CarRequestDTO {
    @NotBlank
    private String make;

    @NotBlank
    private String model;

    @Min(1886)
    private int year;

    @NotBlank
    private String color;

    @Positive
    private double price;

}

