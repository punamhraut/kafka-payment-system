package com.example.carapi.controller;


import com.example.carapi.dto.CarRequestDTO;
import com.example.carapi.dto.CarResponseDTO;
import com.example.carapi.service.CarService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    private final CarService service;

    public CarController(CarService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<CarResponseDTO>> getAll() {
        return ResponseEntity.ok(service.getAllCars());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CarResponseDTO> getById(
            @PathVariable Long id) {
        return ResponseEntity.ok(service.getCarById(id));
    }

    @PostMapping
    public ResponseEntity<CarResponseDTO> create(
            @Valid @RequestBody CarRequestDTO dto) {
        CarResponseDTO created = service.createCar(dto);
        URI location = URI.create("/api/cars/" + created.getId());
        return ResponseEntity.created(location).body(created);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CarResponseDTO> update(
            @PathVariable Long id,
            @Valid @RequestBody CarRequestDTO dto) {
        return ResponseEntity.ok(service.updateCar(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(
            @PathVariable Long id) {
        service.deleteCar(id);
        return ResponseEntity.noContent().build();
    }
}