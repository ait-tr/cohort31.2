public class Car implements Movable,Breakable{
    @Override
    public void canMove() {
        System.out.println(" a car can drive");
    }

    @Override
    public void canBreak() {
        System.out.println("A car can break");
    }
}
