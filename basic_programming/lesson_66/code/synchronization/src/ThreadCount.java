public class ThreadCount implements Runnable{

    CounterCommon result;

    public ThreadCount(CounterCommon result) {
        this.result = result;
    }

    public void run(){
        result.increment();
    }
}
