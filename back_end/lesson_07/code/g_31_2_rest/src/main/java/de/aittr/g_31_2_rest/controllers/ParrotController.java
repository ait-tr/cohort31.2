package de.aittr.g_31_2_rest.controllers;

import de.aittr.g_31_2_rest.domain.Parrot;
import de.aittr.g_31_2_rest.services.ParrotService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parrots")
public class ParrotController {

    private ParrotService service;

    public ParrotController(ParrotService service) {
        this.service = service;
    }

    // localhost:8080/parrots
    @GetMapping
    public List<Parrot> getAll() {
        return service.getAll();
    }

    // localhost:8080/parrots/3
    @GetMapping("/{id}")
    public Parrot getById(@PathVariable int id) {
        return service.getById(id);
    }

    /*
    Домашнее задание 7
    1. Реализовать сохранение попугаев в БД (входящий ИД не должен учитываться)
     */
    // localhost:8080/parrots
    @PostMapping
    public Parrot save(@RequestBody Parrot parrot) {
        return service.save(parrot);
    }

    /*
    Домашнее задание 7
    2. Реализовать удаление попугаев из БД по ИД
    */
    // localhost:8080/parrots/3
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable int id) {
        service.deleteById(id);
    }
}