package shapes;

public class Rectangle extends Shape{
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void calculateSquare() {
        if (height == width) {
            calculateSquare(height);
            return;
        }
        int square = height * width;
        System.out.println("Square: " + square);
    }

    private void calculateSquare(int height) {
        int square = height * height;
        System.out.println("Square: " + square);
    }

    @Override
    public void remit() {
        int remit = 2 *(height + width);
        System.out.println("Remit: " + remit);
    }
}
