public class PizzaFactory {

    public Pizza createPizza( String type ){

        switch (type) {
            case "1": return new PizzaSalami();
            case "2": return new PizzaMozarella();
            case "3": return new PizzaHawaii();
            default:  return null;


        }
    }
}
