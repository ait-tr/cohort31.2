public class Auto implements Comparable<Auto> {

    public String make;
    public String model;
    public int price;

    public Auto(String make, String model, int price) {
        this.make = make;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    public int compareTo( Auto auto){
        int flag = this.model.compareTo(auto.model);
        if(flag == 0){
            flag = Integer.compare(this.price,auto.price);
        }
        return flag;
    }
}
