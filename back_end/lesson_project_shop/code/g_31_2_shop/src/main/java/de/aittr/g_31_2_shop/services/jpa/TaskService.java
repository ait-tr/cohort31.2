package de.aittr.g_31_2_shop.services.jpa;

import de.aittr.g_31_2_shop.domain.jpa.Task;
import de.aittr.g_31_2_shop.repositories.jpa.TaskRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    private TaskRepository repository;
    private Logger logger = LoggerFactory.getLogger(TaskService.class);

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public void createTask(String description) {
        logger.info(description);
        Task task = new Task(description);
        repository.save(task);
    }

    /*
    Домашнее задание 18
    1. Реализовать вывод в консоль каждые 30 секунд списка последних пяти выполненных задач.
    Время выполнения предыдущей задачи не должно влиять на старт следующей.
    Создавать новую задачу и логировать ничего не нужно.
    */

    public List<Task> getLastTasks(int count) {
        return repository.findLastTasks(count);
    }
}