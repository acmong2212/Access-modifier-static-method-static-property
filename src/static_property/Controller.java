package static_property;

import java.util.Scanner;

public class Controller {
    public static void show(Car[] cars) {
        for (Car a : cars) {
            System.out.println(a.toString());
        }
    }

    public static Car[] createCar(Car[] cars) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten oto");
        String name = scanner.nextLine();
        System.out.println("Nhap dong co");
        String engine = scanner.nextLine();

        Car car = new Car(name, engine);

        Car[] newCar = new Car[cars.length + 1];
        for (int i = 0; i < cars.length; i++) {
            newCar[i] = cars[i];
        }

        newCar[newCar.length - 1] = car;
        return newCar;
    }
}
