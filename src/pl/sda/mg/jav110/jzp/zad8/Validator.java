package pl.sda.mg.jav110.jzp.zad8;

public interface Validator {
    /**
     * Metoda validuje obiekt typu Parcel wg nastepujacych zasad:
     *  - suma wymiarów (x, y, z) nie przekracza 300
     *  - każdy z rozmiarów nie jest mniejszy niż 30
     *  - waga nie przekracza 30.0 dla isExpress=false
     *  - waga nie przekracza 15.0 dla isExpress=true
     * @param parcel
     * @return Metoda zwraca true jeżeli wszystkie warunki validacyjne zostały spełnione, inaczej zwraca false.
     */
    boolean validate(Parcel parcel);
}
