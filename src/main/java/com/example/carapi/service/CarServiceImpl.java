package com.example.carapi.service;

import com.example.carapi.dto.CarRequestDTO;
import com.example.carapi.dto.CarResponseDTO;
import com.example.carapi.exception.CarNotFoundException;
import com.example.carapi.model.Car;
import com.example.carapi.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarRepository repo;

    public CarServiceImpl(CarRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<CarResponseDTO> getAllCars() {
        return repo.findAll().stream()
                .map(CarResponseDTO::from)
                .toList();
    }

    @Override
    public CarResponseDTO getCarById(Long id) {
        Car car = repo.findById(id)
                .orElseThrow(() -> new CarNotFoundException(id));
        return CarResponseDTO.from(car);
    }

    @Override
    public CarResponseDTO createCar(CarRequestDTO dto) {
        Car car = new Car(dto.getMake(), dto.getModel(),
                dto.getYear(), dto.getColor(), dto.getPrice());
        return CarResponseDTO.from(repo.save(car));
    }

    @Override
    public CarResponseDTO updateCar(Long id, CarRequestDTO dto) {
        Car car = repo.findById(id)
                .orElseThrow(() -> new CarNotFoundException(id));
        car.setMake(dto.getMake());
        car.setModel(dto.getModel());
        car.setYear(dto.getYear());
        car.setColor(dto.getColor());
        car.setPrice(dto.getPrice());
        return CarResponseDTO.from(repo.save(car));
    }

    @Override
    public void deleteCar(Long id) {
        if (!repo.existsById(id))
            throw new CarNotFoundException(id);
        repo.deleteById(id);
    }
}
