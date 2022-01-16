package pl.sda.mg.jav110.jzp.zad12;

import java.util.Comparator;
import java.util.function.Function;

public enum SortType {
    ASC(Comparator.naturalOrder()),
    DESC(Comparator.reverseOrder());

    private final Comparator<String> orderComparator;

    SortType(Comparator<String> orderComparator) {
        this.orderComparator = orderComparator;
    }

    public Comparator<Car> getComparator(Function<Car, String> fieldExtractor) {
        Comparator<Car> defaultComparator = Comparator.comparing(c -> fieldExtractor.apply(c));
        if (this == DESC) {
            defaultComparator = defaultComparator.reversed();
        }

        return defaultComparator;
    }
}
