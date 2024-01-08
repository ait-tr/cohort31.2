package app.controllers;

import app.services.UserService;

import java.util.Scanner;

public class UserController {

    private Scanner scanner;
    private UserService service;

    public UserController(Scanner scanner, UserService service) {
        this.scanner = scanner;
        this.service = service;
    }

    public void addUser() {

        System.out.println("Введите email");
        String email = scanner.nextLine();

        System.out.println("Введите пароль");
        String password = scanner.nextLine();

        service.addUser(email, password);
    }

    // TODO реализовать метод получения одного пользователя из БД
    // TODO (идентификатор нужно запросить у клиента через консоль)
    // TODO реализовать метод получения всех пользователей
    // TODO Оба эти метода должны просто выводить результат в консоль
}