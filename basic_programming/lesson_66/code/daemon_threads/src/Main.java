public class Main {

    // Daemon thread
    // void setDaemon(boolean status) - для первращения потока  в daemon и наоборот
    // boolean isDaemon() -  проверяет статус
    public static void main(String[] args) {


        DaemonThreadExample example1 = new DaemonThreadExample();
        DaemonThreadExample example2 = new DaemonThreadExample();

        example1.setDaemon(true);

        example1.start();
        example2.start();
    }
}
