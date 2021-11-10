package access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    private double area;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return area = radius*radius * 3.14;
    }
}
