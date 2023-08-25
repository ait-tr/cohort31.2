public class Truck extends Car{

    private int maxWeight;
    private int currentWeight = 0;

    private int maxFuel;
    private int currentFuel = 0;

    public Truck( String model,
                  String manufacturer,
                  int year,
                  String colour,
                  int maxWeight,
                  int maxFuel){
        super( model,manufacturer,year,colour);
        this.maxWeight = maxWeight;
        this.maxFuel = maxFuel;
    }

    public void load( int weight){
        if( weight > getRemainingCapacity()){
            System.out.println("This is too heavy for me ! Can't continue");
            printRemainingCapacity();
            return;
        }
        currentWeight += weight;

        System.out.println("Loading " + weight + " tons............");
        System.out.println("Loaded " + weight + " tons");
        printRemainingCapacity();
    }

    public void unload( int unloadingWeight ){
        if( unloadingWeight > currentWeight){
            System.out.println("Not enough cargo!");
            printRemainingCargo();
            return;
        }

        if( unloadingWeight < 0){
            System.out.println("Can't unload negative weight");
            return;
        }

        currentWeight -= unloadingWeight;

        System.out.println("Unloading "+unloadingWeight + " tons.......");
        System.out.println("Unloaded " + unloadingWeight + " tons");
        printRemainingCargo();
    }

    private void printRemainingCargo(){
        System.out.println("Remaining cargo weight is " + currentWeight + " tons");
    }

    public void move(){
        if( currentFuel == 0){
            System.out.println("Not enough fuel, can't drive");
            return;
        }

        if(currentWeight == 0){
            System.out.println("Please load truck before driving!");
            return;
        }

        System.out.println("Trying.....");
        System.out.println("Trying.....");
        System.out.println("Trying.....");
        System.out.println("Yeah, driving !!!");
    }

    public void stop(){
        System.out.println("Stopping....");
        System.out.println("Stopping....");
        System.out.println("Yeah!!");
    }

    public void setCurrentFuel( int currentFuel){
        if(currentFuel <= maxFuel)
            this.currentFuel = currentFuel;
        else
            System.out.println(" my fuel tank is only "+maxFuel+ "litres");
    }

    private void printRemainingCapacity(){
        System.out.println("Remaining capacity " + getRemainingCapacity() + " tons");
    }

    private int getRemainingCapacity(){
        return maxWeight - currentWeight;
    }
}
