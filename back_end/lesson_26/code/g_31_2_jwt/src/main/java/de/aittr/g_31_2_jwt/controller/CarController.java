package de.aittr.g_31_2_jwt.controller;

import de.aittr.g_31_2_jwt.domain.entity.Car;
import de.aittr.g_31_2_jwt.service.CarService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Tag(name = "Car controller", description = "Controller for some operations with available cars")
@RestController
@RequestMapping("/car")
public class CarController {

    private CarService service;

    public CarController(CarService service) {
        this.service = service;
    }

    @Operation(
            summary = "Get all cars",
            description = "Receiving all cars available in the database"
    )
    @GetMapping
    public List<Car> getAll() {
        return service.getAll();
    }
}