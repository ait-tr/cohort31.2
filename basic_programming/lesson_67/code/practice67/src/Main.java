public class Main {
    /*
    Сотрудники банка выдают кредиты. У каждого есть диапазон по времени - максимальное время и минимальное время которое
    требуется сотруднику для выдачи кредита. ( minTime, maxTime) . Но среди них есть сотрудник/сотрудники, у которых
    вдруг возрастает работоспособность и они начинают выдавать кредиты быстрее, а затем опять скорость может снижатьс до
    обычной.
    Посчитать время, за которое каждый сотрудник выдаст N  кредитов

    1. создать классы:
    -   абстрактный класс AbstractClerk
    -   дочерние классы RegularClerk, LazyInspiredClerk
    2. Должна быть возможность на основе классов создавать потоки. Т.е. родительский класс  должен реализовывать Runnable
     */
    private static final int MIN_TIME = 100;
    private static final int MAX_TIME = 150;
    private static final int CREDITS_NUM = 20;

    public static void main(String[] args)throws InterruptedException {

        AbstractClerk mary = new RegularClark("Mary",
                                            (int)(MIN_TIME / 1.2),
                                            (int)(MAX_TIME/1.2),
                                            CREDITS_NUM);
        AbstractClerk peter = new RegularClark("Peter",MIN_TIME,MAX_TIME,CREDITS_NUM);

        AbstractClerk john = new LazyInspiredClerk("John",
                                                 MIN_TIME,
                                                 MAX_TIME,
                                                CREDITS_NUM,
                                                1.5);

        AbstractClerk[] clerks = {mary,peter,john};

        Thread th1 = new Thread(mary);
        Thread th2 = new Thread(peter);
        Thread th3 = new Thread(john);

        long startTime = System.currentTimeMillis();
        th1.start();
        th2.start();
        th3.start();

        th1.join();
        th2.join();
        th3.join();


        for( int i = 0; i < clerks.length; i++){
            System.out.println(" The clerk called " + clerks[i].getName() + " issued all credits within " +
                    (clerks[i].getFinishTime() - startTime));
        }

    }
}
