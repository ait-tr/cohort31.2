public class Auto {

    public void gas() {
        /*
        Происходят какие-то сложные действия,
        в результате которых автомобиль движется вперед
        */
        System.out.println("Авто едет вперед!");
    }
    public void breakMe() {
        /*
         Происходят какие-то сложные действия,
        в результате которых автомобиль замедляется
         */
        System.out.println("Авто замедляется!");
    }

    public static void main(String[] args) {
        Auto auto = new Auto();

        auto.gas();
        auto.breakMe();
    }
}
