package de.aittr.g_31_2_shop.scheduling;

import de.aittr.g_31_2_shop.domain.jpa.Task;
import de.aittr.g_31_2_shop.services.interfaces.ProductService;
import de.aittr.g_31_2_shop.services.jpa.JpaProductService;
import de.aittr.g_31_2_shop.services.jpa.TaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.DefaultManagedTaskScheduler;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.List;

@Component
@EnableScheduling
@EnableAsync
public class ScheduleExecutor {

    private TaskService taskService;
    private JpaProductService productService;
    private static Logger logger = LoggerFactory.getLogger(ScheduleExecutor.class);

    public ScheduleExecutor(TaskService taskService, JpaProductService productService) {
        this.taskService = taskService;
        this.productService = productService;
    }

    //    @Scheduled(fixedDelay = 5000)
//    public void fixedDelayTask() {
//        taskService.createTask("Fixed delay task");
//    }

//    @Scheduled(fixedDelay = 5000)
//    public void fixedDelayTask() {
//        taskService.createTask("Fixed delay task 3000 ms");
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }

//    @Scheduled(fixedDelay = 5000)
//    public void fixedDelayTask() {
//        taskService.createTask("Fixed delay task 7000 ms");
//        try {
//            Thread.sleep(7000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }

//    @Scheduled(fixedRate = 5000)
//    public void fixedRateTask() {
//        taskService.createTask("Fixed rate task 3000 ms");
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }

//    @Scheduled(fixedRate = 5000)
//    public void fixedRateTask() {
//        taskService.createTask("Fixed rate task 7000 ms");
//        try {
//            Thread.sleep(7000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }

//    @Scheduled(fixedRate = 5000)
//    @Async
//    public void fixedRateAsyncTask() {
//        taskService.createTask("Fixed rate async task 7000 ms");
//        try {
//            Thread.sleep(7000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }

//    @Scheduled(fixedDelay = 5000, initialDelay = 20000)
//    public void initialDelayTask() {
//        taskService.createTask("Initial delay task");
//    }

    // 2 hours -> 7200000 milliseconds -> PT2H

//    @Scheduled(fixedDelayString = "PT3S")
//    public void anotherDelayFormatTask() {
//        taskService.createTask("Another delay format task");
//    }

    // 55 * * * * * -> каждую минуту в момент времени 55 секунд
    // 0 10,20 * * * * -> каждый час в 10 минут и в 20 минут
    // 0 15 9-17 * * MON-FRI -> по будням с 9 до 17 в 15 минут каждого часа

//    @Scheduled(cron = "10,30 * * * * *")
//    public void cronExpressionTask() {
//        taskService.createTask("Cron expression task");
//    }

//    public static void scheduleAndExecuteTask(Task task) {
//        TaskScheduler scheduler = new DefaultManagedTaskScheduler();
//        scheduler.schedule(
//                () -> logger.info(task.getDescription()),
//                new CronTrigger("0,10,20,30,40,50 * * * * *")
//        );
//    }

//    public static void scheduleAndExecuteTask(Task task) {
//        TaskScheduler scheduler = new DefaultManagedTaskScheduler();
//        Instant instant = Instant.now().plusSeconds(30);
//        scheduler.schedule(
//                () -> logger.info(task.getDescription()),
//                instant
//        );
//    }

    /*
    Домашнее задание 18
    1. Реализовать вывод в консоль каждые 30 секунд списка последних пяти выполненных задач.
    Время выполнения предыдущей задачи не должно влиять на старт следующей.
    Создавать новую задачу и логировать ничего не нужно.
     */

//    @Scheduled(fixedRateString = "PT30S")
//    public void printLastFiveTasks() {
//        System.out.println("Last five tasks:");
//        taskService.getLastTasks(5).forEach(System.out::println);
//    }

    /*
    Домашнее задание 18
    2. Реализовать вывод в консоль последнего добавленного в БД товара.
    Вывод должен производиться в 15 и 45 секунд каждой минуты.
    Задача должна быть сохранена в БД.
    Вывод в консоль должен быть осуществлён через логирование поля description созданной задачи.
    Пример значения поля description - "Последний добавленный в БД продукт - Банан".
     */

//    @Scheduled(cron = "15,45 * * * * *")
//    public void printLastAddedProduct() {
//        taskService.createTask("Last added to database product: " +
//                productService.getLastProduct());
//    }
}