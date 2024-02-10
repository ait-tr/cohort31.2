package de.aittr.g_31_2_rest.services;

import de.aittr.g_31_2_rest.domain.Parrot;
import de.aittr.g_31_2_rest.repositories.ParrotRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParrotService {

    private ParrotRepository repository;

    public ParrotService(ParrotRepository repository) {
        this.repository = repository;
    }

    public List<Parrot> getAll() {
        return repository.getAll();
    }

    public Parrot getById(int id) {
        return repository.getById(id);
    }

    /*
    Домашнее задание 7
    1. Реализовать сохранение попугаев в БД (входящий ИД не должен учитываться)
     */
    public Parrot save(Parrot parrot) {
        return repository.save(parrot);
    }

    /*
    Домашнее задание 7
    2. Реализовать удаление попугаев из БД по ИД
     */
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}