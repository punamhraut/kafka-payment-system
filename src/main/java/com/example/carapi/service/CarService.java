package com.example.carapi.service;

import com.example.carapi.dto.CarRequestDTO;
import com.example.carapi.dto.CarResponseDTO;

import java.util.List;


public interface CarService {
    List<CarResponseDTO> getAllCars();
    CarResponseDTO getCarById(Long id);
    CarResponseDTO       createCar(CarRequestDTO dto);
    CarResponseDTO       updateCar(Long id, CarRequestDTO dto);
    void                 deleteCar(Long id);
}