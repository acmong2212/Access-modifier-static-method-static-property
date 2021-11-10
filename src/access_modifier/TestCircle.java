package access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(7);

        System.out.println(circle.getColor());
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
    }
}
