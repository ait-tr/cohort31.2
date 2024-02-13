package app;

import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class StudentServiceTest {

    private StudentService studentService;

    @Before
    public void init() {
        studentService = new StudentService();
        studentService.addStudent(new Student(1, "John"));
    }

    @Test
    public void checkCorrectStudent() {
        Student expected = new Student(1, "John");
        Student actual = studentService.getById(1);
        assertEquals(expected, actual);
    }

    @Test(expected = NoSuchElementException.class)
    public void exceptionIfIdIsNotExists() {
        studentService.getById(5);
    }
}