package de.aittr.g_31_2_jwt.repository;

import de.aittr.g_31_2_jwt.domain.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {
}