import java.util.Objects;

public class Order {

    private int id;
    private String name;

    public Order(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Order)) return false;

        Order order = (Order) obj;

        return this.id == order.id && name.equals(order.name);
    }

    /*   @Override
       public int hashCode() {
           int result = id;
           result = 31 * result + name.hashCode();
           return result;
       }
   */
    public int hashCode() {
        return Objects.hash(id, name);
    }


  /*  @Override
    public int hashCode() {
        int hash = 7;
       hash = 31 * hash *id + name.hashCode();

       return hash;
    }*/

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
