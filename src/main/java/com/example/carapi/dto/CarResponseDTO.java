package com.example.carapi.dto;

import com.example.carapi.model.Car;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CarResponseDTO {
    private Long id;
    private String make;
    private String model;
    private int year;
    private String color;
    private double price;


    // Static factory — maps entity → DTO
    public static CarResponseDTO from(Car car) {
        return new CarResponseDTO(
                car.getId(), car.getMake(), car.getModel(),
                car.getYear(), car.getColor(), car.getPrice()
        );
    }
}
