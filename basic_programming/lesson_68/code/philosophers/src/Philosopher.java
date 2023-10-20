import java.util.Random;

public class Philosopher implements Runnable{

    private Object leftStick;
    private Object rightStick;

    private Random random = new Random();

    public Philosopher(Object leftStick, Object rightStick) {
        this.leftStick = leftStick;
        this.rightStick = rightStick;
    }


    public void run(){
        try {
            while (true) {
                doAction("thinking");
                synchronized (leftStick){
                    doAction("picked up left stick");
                    synchronized (rightStick){
                        doAction("picked up right stick");
                        doAction("eating");
                        doAction("put down right stick");
                    }
                    doAction("put down left stick");
                }


            }
        }
        catch (InterruptedException e){
            e.getMessage();
        }
    }

    private void doAction( String action) throws InterruptedException
    {
        System.out.println(Thread.currentThread().getName() + " "+action);
        Thread.sleep(random.nextInt(1000));
    }
}
