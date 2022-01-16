package pl.sda.mg.jav110.jzp.zad12;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarMain {
    public static void main(String[] args) {
        Manufacturer m1 = new Manufacturer("VW", 2000, "Czechy");
        Manufacturer m2 = new Manufacturer("SEAT", 2001, "Hiszpania");
        Manufacturer m3 = new Manufacturer("TOYOTA", 1980, "Japonia");

        Car c1 = new Car("VW GOLF", "VARIANT", Double.valueOf(100d), 2003, Arrays.asList(m1,m2), Engine.V6);
        Car c2 = new Car("VW GOLF", "VARIANT", Double.valueOf(100d), 2003, Arrays.asList(m1,m2), Engine.V6);
        Car c3 = new Car("VW GOLF", "VARIANT", Double.valueOf(100d), 2003, Arrays.asList(m1,m2), Engine.V8);
        Car c4 = new Car("aa", "VARIANT", Double.valueOf(100d), 2009, Arrays.asList(m1,m2, m3), Engine.V8);
        Car c5 = new Car("ba", "VARIANT", Double.valueOf(100d), 2005, Arrays.asList(m1,m2, m3), Engine.V8);
        Car c6 = new Car("ga", "VARIANT", Double.valueOf(100d), 2002, Arrays.asList(m1,m2, m3), Engine.V8);
        Car c7 = new Car("ca", "VARIANT", Double.valueOf(100d), 2000, Arrays.asList(m3), Engine.V8);


        System.out.println("Czy c1 jest taki sam jak c2: " + c1.equals(c2));
        System.out.println("Czy c1 jest taki sam jak c3: " + c1.equals(c3));
        System.out.println("Czy zadziała poprawnie dla null: " + c1.equals(null));

        System.out.println("Posortowane samochody: ");
        Comparator<Car> comparator = SortType.ASC.getComparator(Car::getYear);
        System.out.println(Stream.of(c1, c4, c5, c6, c7)
                .sorted(comparator)
                .map(Car::toString)
                .collect(Collectors.joining(", ")));


        CarService carService = new CarService();
        carService.addCar(c1)
                .addCar(c2)
                .addCar(c3)
                .addCar(c4)
                .addCar(c5)
                .addCar(c6)
                .addCar(c7);


        List<Car> cars = carService.getCarsProducedByManufacturerWithYear(1999, ComparisonFunction.MORE_THAN);
        System.out.println("Samochody zawierajace producenta z rokiem zalozenia po 1999:");
        System.out.println(cars);

    }
}
