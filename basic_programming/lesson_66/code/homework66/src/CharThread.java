public class CharThread extends Thread{

    private final char symbol;

    public CharThread(char symbol) {
        this.symbol = symbol;
    }

    public void run(){
        for( int i = 0; i < 100; i++){
            System.out.println(symbol);
            try {
                Thread.sleep(10);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }

}
