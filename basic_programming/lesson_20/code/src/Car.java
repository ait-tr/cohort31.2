public class Car {
    static int numberOfCars;
    String name;
    int powerPS;

    public Car(String name, int powerPS) {
        this.name = name;
        this.powerPS = powerPS;
        numberOfCars++;
    }

    public static void main(String[] args) {
        Car car1 = new Car("BMW", 220);
        Car car2 = new Car("Seat", 95);

        System.out.println("Всего машин: " + numberOfCars);

        // OUTPUT: Всего машин: 2

    }
}
