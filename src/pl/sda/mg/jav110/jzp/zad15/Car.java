package pl.sda.mg.jav110.jzp.zad15;

import java.util.Arrays;
import java.util.List;

public enum Car {
    FERRARI(12, 350, true),
    PORSCHE(11, 320, true),
    MERCEDES(10, 250, true),
    BMW(9, 240, true),
    OPEL(8, 200, false),
    FIAT(3, 130, false),
    TOYOTA(4, 140, false);

    private double price;
    private int power;
    private boolean premium;

    private static List<Car> PREMIUM_CARS = Arrays.asList(FERRARI, PORSCHE, MERCEDES, BMW);

    Car(double price, int power, boolean premium) {
        this.price = price;
        this.power = power;
        this.premium = premium;
    }

    public int getPower() {
        return power;
    }

    public double getPrice() {
        return price;
    }

    public boolean isPremium() {
        return PREMIUM_CARS.contains(this);
//        return premium;
    }

    public boolean isRegular() {
        return !premium;
    }

    public boolean isFasterThan(Car car) {
        return this.compareTo(car) > 1;
//        return this.getPower() > car.getPower();
//        return compareTo(this, car) > 0;
    }

//    public int compareTo(Car c1, Car c2) {
//        return c1.getPower() > c2.getPower() ? 1 : -1;
//    }
}
