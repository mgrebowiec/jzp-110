package pl.sda.mg.jav110.jzp.zad12;

import java.util.Objects;

public class Manufacturer {
    private final String name;
    private final int year;
    private final String country;

    public Manufacturer(String name, int year, String country) {
        this.name = name;
        this.year = year;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || !(obj instanceof Manufacturer)) {
            return false;
        }

        Manufacturer m = (Manufacturer) obj;

        return year == m.getYear()
                && Objects.equals(name, m.getName())
                && Objects.equals(country, m.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, name, country);
    }
}
