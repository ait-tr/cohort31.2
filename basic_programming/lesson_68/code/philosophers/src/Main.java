public class Main {

    /*
    while(true){
      think() //  философ думает о жизни

      pickUpLeftStick()
      pickUpRightStick()
      eat()
      putDownRightStick()
      putDownLeftStick()

      //  продолжает думать
    }
     */
    public static void main(String[] args) {
        Philosopher[] philosophers = new Philosopher[5];
        Object[]sticks = new Object[philosophers.length];

        for(int i = 0; i < sticks.length; i++){
            sticks[i] = new Object();
        }

        for( int i = 0; i < philosophers.length; i++){
            Object leftStick = sticks[i];
            Object rightStick =sticks[(i+1)% sticks.length];

            if(i == philosophers.length - 1){
                philosophers[i] = new Philosopher(rightStick,leftStick);
            }
            else {
                philosophers[i] = new Philosopher(leftStick, rightStick);
            }
            new Thread(philosophers[i],"Philosopher "+(i +1)).start();

        }
    }
}
