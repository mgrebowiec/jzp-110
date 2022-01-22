package pl.sda.mg.jav110.jzp.zad15;

public class Main {
    public static void main(String[] args) {
        Car car1 = Car.FERRARI;
        Car car2 = Car.OPEL;

        System.out.printf("%s is faster than %s: %s", car1, car2, car1.isFasterThan(car2));
    }
}
