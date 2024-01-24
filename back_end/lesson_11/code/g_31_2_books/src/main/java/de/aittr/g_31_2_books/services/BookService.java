package de.aittr.g_31_2_books.services;

import de.aittr.g_31_2_books.domain.Book;
import de.aittr.g_31_2_books.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public List<Book> getAll() {
        return repository.findAll();
    }

    public void deleteByName(String name) {
        repository.deleteByName(name);
    }

    public double getAverageYear() {
        return repository.getAverageYear();
    }
}