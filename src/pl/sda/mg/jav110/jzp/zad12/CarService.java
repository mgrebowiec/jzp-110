package pl.sda.mg.jav110.jzp.zad12;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CarService {
    private List<Car> cars = new ArrayList<>();

    public CarService addCar(Car car) {
        cars.add(car);
        return this;
    }

    public CarService removeCar(Car car) {
        cars.remove(car);
        return this;
    }

    public List<Car> getAllCars() {
        return Collections.unmodifiableList(cars);
    }

    public void printCars() {
        System.out.println("Lista samochodow:");
        System.out.println(cars);
    }

    public List<Car> getCarsWithEngine(Engine engine) {
        return cars.stream()
                .filter(car -> car.getEngine() == engine)
                .collect(Collectors.toList());
    }

    public List<Car> getCarsProducedBeforeYear(int year) {
        return cars.stream()
                .filter(car -> car.getYear() < year)
                .collect(Collectors.toList());
    }

    public Optional<Car> getMostExpensiveCar() {
        return cars.stream()
                .max(Comparator.comparing(Car::getPrice));
    }

    public Optional<Car> getCheapestCar() {
        return cars.stream()
                .min(Comparator.comparing(Car::getPrice));
    }

    public List<Car> getCarsWithMinProducerCount(int producerCount) {
        return cars.stream()
                .filter(car -> car.getManufacturers().size() >= producerCount)
                .collect(Collectors.toList());
    }

    public List<Car> sortCars(SortType sortType, Function<Car, ? extends Comparable> fieldExtractor) {
        return cars.stream()
                .sorted(sortType.getComparator(fieldExtractor))
                .collect(Collectors.toList());
    }

    public boolean isCarExist(Car car) {
        return cars.contains(car);
    }

    public List<Car> getCarsProducedBy(Manufacturer manufacturer) {
        return cars.stream()
                .filter(car -> car.getManufacturers().contains(manufacturer))
                .collect(Collectors.toList());
    }

    public List<Car> getCarsProducedByManufacturerWithYear(int year, ComparisonFunction comparisonFunction) {
        return cars.stream()
                .filter(car -> car.getManufacturers().stream().anyMatch(comparisonFunction.getManufacturerPredicate(year)))
                .collect(Collectors.toList());
    }

}
