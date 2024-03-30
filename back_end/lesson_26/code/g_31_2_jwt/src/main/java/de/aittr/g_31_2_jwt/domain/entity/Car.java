package de.aittr.g_31_2_jwt.domain.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;

import java.util.Objects;

@Schema(description = "Car entity")
@Entity
@Table(name = "car")
public class Car {

    @Schema(description = "Car unique identifier", example = "15")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Schema(description = "Car brand", example = "Honda")
    @Column(name = "brand")
    private String brand;

    @Schema(description = "Year of car manufacture", example = "2022")
    @Column(name = "year")
    private int year;

    @Schema(description = "Car price", example = "50000")
    @Column(name = "price")
    private double price;

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && year == car.year && Double.compare(price, car.price) == 0 && Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, year, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}