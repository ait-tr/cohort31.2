public class LazyInspiredClerk extends AbstractClerk{
    private static int INSPIRATION_PROBABILITY = 20; //  вероятность вдохновения
    private static int INSPIRATION_TIMES = 3; // сколько раз выдает кредиты быстрее

    private double inspirationCoef;

    public LazyInspiredClerk(String name, int minTime, int maxTime, int creditsNum, double inspirationCoef){
        super(name,minTime,maxTime,creditsNum);
        this.inspirationCoef = inspirationCoef;
    }

    public void run(){
        int inspiredCreditsMore = 0;
        for( int i = 0; i < creditsNum; i++){
            int timeToSleep;

            if( inspiredCreditsMore == 0 && random.nextInt(100)> INSPIRATION_PROBABILITY){
                inspiredCreditsMore = INSPIRATION_TIMES;
            }


            if(inspiredCreditsMore > 0){
                timeToSleep =(int) ((minTime + random.nextInt(maxTime - minTime))/inspirationCoef);
                inspiredCreditsMore--;
            } else {
                timeToSleep = minTime + random.nextInt(maxTime - minTime);
            }

            try {
                Thread.sleep(timeToSleep);
            } catch (InterruptedException e){
                return;
            }

        }
        finishTime = System.currentTimeMillis();

    }


}
