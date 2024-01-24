package de.aittr.g_31_2_books.controllers;

import de.aittr.g_31_2_books.domain.Book;
import de.aittr.g_31_2_books.services.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    private BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @GetMapping
    public List<Book> getAll() {
        return service.getAll();
    }

    @DeleteMapping("/{name}")
    public void deleteByName(@PathVariable String name) {
        service.deleteByName(name);
    }

    @GetMapping("/year")
    public double getAverageYear() {
        return service.getAverageYear();
    }
}