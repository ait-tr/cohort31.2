package app.services;

import app.domain.User;
import app.repositories.UserRepository;

public class UserService {

    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void addUser(String email, String password) {

        // TODO проверка параметров на null и пустоту - домашнее задание

        if (!email.contains("@")) {
            throw new IllegalArgumentException("Email должен содержать @");
        }

        // TODO проверить, не существует ли уже в БД пользователь с таким email

        repository.save(new User(email, password));
    }

    // TODO реализовать методы по получению одного и всех пользователей
}