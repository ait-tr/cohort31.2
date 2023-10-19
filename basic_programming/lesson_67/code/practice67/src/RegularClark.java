public class RegularClark extends AbstractClerk{

    public RegularClark( String name, int minTime, int maxTime, int creditsNum){
        super(name,minTime,maxTime,creditsNum);
    }


    @Override
    public void run() {
        for(int i = 0; i < creditsNum; i++){
            int toSleep = random.nextInt(maxTime - minTime) + minTime;
            try {
                Thread.sleep(toSleep);
            } catch (InterruptedException e){
                return;
            }
        }
        finishTime = System.currentTimeMillis();

    }
}
