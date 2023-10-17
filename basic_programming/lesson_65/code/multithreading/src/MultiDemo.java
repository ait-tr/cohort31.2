public class MultiDemo extends Thread{

    public MultiDemo(String name){
        super(name);
    }

    //  метод run  - это и есть тот метод, который выполняется в потоке
    public void run(){
       // System.out.println(" MultiDemo thread is running now");
        System.out.println(Thread.currentThread().getName() +" started");
        try{
            Thread.sleep(600);
        }
        catch (InterruptedException e){
            System.out.println("The thread has been interrupted");
        }
        System.out.println(Thread.currentThread().getName() + " finished");
    }
}
