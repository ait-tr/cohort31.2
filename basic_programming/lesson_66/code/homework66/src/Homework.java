public class Homework {
    public static void main(String[] args) throws InterruptedException {
        // Написать метод 100 раз печатающий char и вывести на экран результат
        // его работы для двух потоков ( например, один поток печатает # , второй *).
        // В конце должно выводиться " end of main"

        Thread hashThread = new CharThread('#');
        Thread starThread = new CharThread('*');

        hashThread.start();
        starThread.start();

        hashThread.join();
        starThread.join(); // заставляет поток, из которого вызван join ( main thread), ждать на этом месте пока
        // не закончится поток от которого вызван join ( hashThread, starThread)

        System.out.println("end of main");
    }

}
