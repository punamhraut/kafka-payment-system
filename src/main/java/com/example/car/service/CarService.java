package com.example.car.service;

import com.example.car.entity.Car;
import com.example.car.repository.CarRepository;
import com.example.car.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private final CarRepository repository;

    public CarService(CarRepository repository) {
        this.repository = repository;
    }

    public List<Car> getAllCars() {
        return repository.findAll();
    }

    public Car getCarById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Car not found with id " + id));
    }

    public Car createCar(Car car) {
        return repository.save(car);
    }

    public Car updateCar(Long id, Car car) {
        Car existing = getCarById(id);
        existing.setBrand(car.getBrand());
        existing.setModel(car.getModel());
        existing.setYear(car.getYear());
        existing.setPrice(car.getPrice());
        return repository.save(existing);
    }

    public void deleteCar(Long id) {
        repository.delete(getCarById(id));
    }
}
