public class TrafficLight implements Runnable{

    private TrafficLightColour colour;
    private boolean stop = false; // остановка программы
    private boolean changed = false; // true  при смене сигнала


    public TrafficLight( TrafficLightColour colour){
        this.colour = colour;
    }

    public TrafficLight(){
        colour = TrafficLightColour.RED;
    }

    public void run(){
        while (!stop){
            try {
                switch (colour) {  //  контролирует продолжительность  сигнала
                    case GREEN:
                        Thread.sleep(3000);
                        break;
                    case YELLOW:
                        Thread.sleep(1500);
                        break;
                    case RED:
                        Thread.sleep(4000);
                        break;
                }
            } catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
            changeColour();
        }

    }


    // метод, контролирующий смену цветов

   public synchronized void changeColour(){
        switch (colour){

            case RED:
                colour = TrafficLightColour.GREEN;
                break;
            case YELLOW:
                colour = TrafficLightColour.RED;
                break;
            case GREEN:
                colour = TrafficLightColour.YELLOW;
        }
        changed = true;
        notify();
   }


   synchronized void waitForChange(){
        try {
            while (!changed)
                wait();
            changed = false;
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
   }

   synchronized TrafficLightColour getColour(){
        return colour;
   }

   synchronized void cancel(){
        stop = true;
   }
}
