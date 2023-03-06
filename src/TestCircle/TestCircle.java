package TestCircle;

public class TestCircle {
    public TestCircle() {
    }

    public TestCircle(double radius) {
        this.radius = radius;
    }

    private static double radius = 1.0;
    private String color = "Red";

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        double area = Math.PI * Math.pow(this.radius, 2);
        return area;
    }
}
