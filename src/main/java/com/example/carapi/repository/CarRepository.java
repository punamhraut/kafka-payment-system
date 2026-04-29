package com.example.carapi.repository;

import com.example.carapi.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository
        extends JpaRepository<Car, Long> {

    // Spring Data JPA provides save, findById,
    // findAll, deleteById out of the box.

    // Custom query example:
    List<Car> findByMakeIgnoreCase(String make);

    // Native query example:
    @Query("SELECT c FROM Car c WHERE c.price <= :maxPrice")
    List<Car> findByMaxPrice(@Param("maxPrice") double maxPrice);
}
