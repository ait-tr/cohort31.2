public class DaemonThreadExample extends Thread{

    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon thread executing");
        }
        else {
            System.out.println("normal thread is executing");
        }
    }
}
