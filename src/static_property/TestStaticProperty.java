package static_property;

import java.util.Scanner;

public class TestStaticProperty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car[] cars = new Car[2];
        cars[0] = new Car("Mazda 3", "Skyactiv 3");
        cars[1] = new Car("Mazda 6", "Skyactiv 6");

        while (true) {
            System.out.println("1. Hien thi oto");
            System.out.println("2. Them oto");
            int so = scanner.nextInt();

            switch (so) {
                case 1:
                    Controller.show(cars);
                    break;
                case 2:
                    cars = Controller.createCar(cars);
                    break;
            }
        }
    }
}

