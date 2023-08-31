public class Car implements Comparable<Car>{

    private String model;
    private int year;
    private int price;

    public Car(String model, int year, int price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public int compareTo( Car car){
        return this.getPrice() - car.getPrice();
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
