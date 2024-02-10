package de.aittr.g_31_2_rest.repositories;

import de.aittr.g_31_2_rest.domain.Parrot;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Repository
public class ParrotRepository implements CrudRepository<Parrot> {

    private final String DB_DRIVER_PATH = "com.mysql.cj.jdbc.Driver";
    private final String DB_ADDRESS = "jdbc:mysql://localhost:3306/";
    private final String DB_NAME = "31_2_parrots";
    private final String DB_USERNAME = "root";
    private final String DB_PASSWORD = "77777";

    private final String ID = "id";
    private final String COLOR = "color";
    private final String WEIGHT = "weight";

    // Метод, который подключается к БД и возвращает объект подключения
    private Connection getConnection() {
        try {
            Class.forName(DB_DRIVER_PATH);
            // http://google.com/example?search=cats&color=black
            // jdbc:mysql://localhost:3306/31_2_parrots?user=root&password=77777
            String dbUrl = String.format("%s%s?user=%s&password=%s",
                    DB_ADDRESS, DB_NAME, DB_USERNAME, DB_PASSWORD);
            return DriverManager.getConnection(dbUrl);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /*
    Домашнее задание 7
    1. Реализовать сохранение попугаев в БД (входящий ИД не должен учитываться)
     */
    @Override
    public Parrot save(Parrot parrot) {
        try (Connection connection = getConnection()) {

            String query = String.format(Locale.US, "INSERT INTO `parrot` " +
                    "(`color`, `weight`) " +
                    "VALUES ('%s', '%.2f');", parrot.getColor(), parrot.getWeight());
            Statement statement = connection.createStatement();
            statement.execute(query, Statement.RETURN_GENERATED_KEYS);

            ResultSet resultSet = statement.getGeneratedKeys();
            resultSet.next();
            parrot.setId(resultSet.getInt(1));
            return parrot;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Parrot> getAll() {
        try (Connection connection = getConnection()) {
            String query = "select * from parrot;";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            List<Parrot> parrots = new ArrayList<>();

            while (resultSet.next()) {
//                int id = resultSet.getInt(1); вариант 1 - передать номер колонки
                int id = resultSet.getInt(ID); // вариант 2 - передать название колонки
                String color = resultSet.getString(COLOR);
                double weight = resultSet.getDouble(WEIGHT);
                Parrot parrot = new Parrot(id, color, weight);
                parrots.add(parrot);
            }

            return parrots;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Parrot getById(int id) {
        try (Connection connection = getConnection()) {

            String query = String.format("select * from parrot where id = %d;", id);
            ResultSet resultSet = connection.createStatement().executeQuery(query);
            Parrot parrot = null;

            while (resultSet.next()) {
                String color = resultSet.getString(COLOR);
                double weight = resultSet.getDouble(WEIGHT);
                parrot = new Parrot(id, color, weight);
            }

            return parrot;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Parrot obj) {
        try (Connection connection = getConnection()) {

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /*
    Домашнее задание 7
    2. Реализовать удаление попугаев из БД по ИД
     */
    @Override
    public void deleteById(int id) {
        try (Connection connection = getConnection()) {

            String query = String.format("DELETE FROM `parrot` WHERE (`id` = '%d');", id);
            connection.createStatement().execute(query);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}