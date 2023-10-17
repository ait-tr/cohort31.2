public class Main {
    // Multithreading - многопоточность
    /*
    thread -  нить
    Есть два вида многозадочности :
    1. process- based -  когда выполняется одновременно несколько программ ( процесс).
    2. thread-based -  когда одновременно выполняется несколько задач в одной программе

    Возможные состояния потока:

    New -  еще не запущенный поток
    Running - исполняющийся
    Blocked - заблокированный поток, который ждет возможности возобновления работы
    Waiting -  состояние ожидания возобновления работы
    Terminated -  закончивший работу

    многопоточность в джаве основана на классе Thread и интерфейсе Runnable
     */
    public static void main(String[] args) throws InterruptedException{

        Thread thread  = Thread.currentThread(); //  получаем текущий поток
        System.out.println(thread.getName());
        System.out.println(thread.getPriority());


        /*
        Основные методы класса Thread
         getName() - возвращает имя потока
         getPriority() - возвращает приоритет потока
         setPriority( int priority) -  установить приоритет потока
         isAlive() -  возвращает  true  если поток активен
         isInterrupted -  true если поток был прерван
         join() -  ожидает завершение потока
         run() -  точка входа в поток
         sleep()- приостанавливает выполнение потока, поток "засыпает"
         start() - запускает поток

         Создать поток можно двумя способами:

         1.Наследование от класса Thread
         */
     //   System.out.println("Main thread started...");

    /*    MultiDemo multiDemo1 = new MultiDemo("OurThread1");
        MultiDemo multiDemo2 = new MultiDemo("OurThread2");

        multiDemo1.start(); // для запуска потока используется метод start()
        multiDemo2.start();
        for(int i = 3; i < 10; i++)
            new MultiDemo("OurThread" + i).start();

     */


    //    System.out.println("Main thread finished");

        // 2.  с помощью интерфейса Runnable
    /*    System.out.println("Main thread started");

        OurThread ourThreadRunnable = new OurThread("FromRunnable#1"); //  обьект класса , реализующего Runnable

        Thread newThread = new Thread(ourThreadRunnable);// создаем поток с этим обьектом

        newThread.start();

        for( int i = 0; i < 30; i++){
            System.out.print(".");
            try{
                Thread.sleep(50);
            }
            catch (InterruptedException e){
                System.out.println("Main is interrupted");
            }
        }

        System.out.println("Main thread finished");*/

     //   Thread thread1 = new Thread(new OurRunnable(),"Another Example");
     //   thread1.start();

        // Определение момента окончания работы потока isAlive()

    /*    System.out.println("Main thread starting");
        MultiDemo multiDemo1 = new MultiDemo("Demo#1");
        MultiDemo multiDemo2 = new MultiDemo("Demo#2");
        MultiDemo multiDemo3 = new MultiDemo("Demo#3");

        multiDemo1.start();
        multiDemo2.start();
        multiDemo3.start();

        do {

            System.out.print(".");
            try{
                Thread.sleep(50);
            }
            catch (InterruptedException e){
                System.out.println("Main interrupted");
            }

        }while( multiDemo1.isAlive() ||
                multiDemo2.isAlive() ||
                multiDemo3.isAlive());

        System.out.println("Main finishing");

     */

        //  метод join() -  заставляет поток ждать пока поток на котором он вызван не закончит работу

        System.out.println("Main thread starting");

        MultiDemo multiDemo1 = new MultiDemo("Demo#1");
        MultiDemo multiDemo2 = new MultiDemo("Demo#2");
        MultiDemo multiDemo3 = new MultiDemo("Demo#3");

        multiDemo1.start();
        multiDemo2.start();
        multiDemo3.start();

        multiDemo1.join();
        multiDemo2.join();
        multiDemo3.join();




            System.out.print(".");
            try{
                Thread.sleep(50);
            }
            catch (InterruptedException e){
                System.out.println("Main interrupted");
            }

        System.out.println("Main finishing");






    }
}
