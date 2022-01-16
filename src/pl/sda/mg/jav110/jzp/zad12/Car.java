package pl.sda.mg.jav110.jzp.zad12;

import java.util.List;
import java.util.Objects;

public class Car {
    private final String name;
    private final String type;
    private final Double price;
    private final int year;
    private final List<Manufacturer> manufacturers;
    private final Engine engine;

    public Car(String name, String type, Double price, int year, List<Manufacturer> manufacturers, Engine engine) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.year = year;
        this.manufacturers = manufacturers;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public List<Manufacturer> getManufacturers() {
        return manufacturers;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || !(o instanceof Car)) {
            return false;
        }
        Car car = (Car) o;
        return year == car.year &&
                Objects.equals(name, car.name) &&
                Objects.equals(type, car.type) &&
                Objects.equals(price, car.price) &&
                Objects.equals(manufacturers, car.manufacturers) &&
                engine == car.engine;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, price, year, manufacturers, engine);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", year=" + year +
                ", manufacturers=" + manufacturers +
                ", engine=" + engine +
                "}\n";
    }
}
