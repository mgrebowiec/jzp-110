package pl.sda.mg.jav110.jzp.zad27;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Joiner <T> {
    private String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(T...elements) {
        if (elements == null) {
            return "";
        }
        return Stream.of(elements)
                .map(t -> t.toString())
                .collect(Collectors.joining(separator));
    }
}
