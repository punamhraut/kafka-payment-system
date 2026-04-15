package com.example.car.controller;

import com.example.car.entity.Car;
import com.example.car.service.CarService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    private final CarService service;

    public CarController(CarService service)
    {
        this.service = service;
    }

    //http://localhost:8080/api/cars/cars
    @GetMapping("/cars")
    public String getCar()
    {
        System.out.println("getting car");
        return "Car";
    }
    @GetMapping
    public List<Car> getAllCars()
    {
        return service.getAllCars();
    }

    @PostMapping("/carsbypostmethod")
    public List<Car> getCars()
    {
        return service.getAllCars();
    }

    @GetMapping("/{id}")
    public Car getCar(@PathVariable Long id)
    {
        return service.getCarById(id);
    }

    @PostMapping
    public Car createCar(@Valid @RequestBody Car car)
    {
        return service.createCar(car);
    }

    @PutMapping("/{id}")
    public Car updateCar(@PathVariable Long id, @Valid @RequestBody Car car)
    {
        return service.updateCar(id, car);
    }

    @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable Long id)
    {
        service.deleteCar(id);
    }
}
