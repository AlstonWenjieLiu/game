public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public static double feetToInches(double feet) {
        return feet * 12;
    }

    public static double inchesToFeet(double inches) {
        return inches / 12;
    }

    public boolean isSquare() {
        return length == width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter(){
        return (2 * length) + (2 * width);
    }
}
