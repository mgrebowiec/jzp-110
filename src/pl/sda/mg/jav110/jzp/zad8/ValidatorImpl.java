package pl.sda.mg.jav110.jzp.zad8;

public class ValidatorImpl implements Validator {
    @Override
    public boolean validate(Parcel parcel) {
        if (parcel.getxLength() + parcel.getyLength() + parcel.getzLength() >= 300) {
            System.out.println("Suma wymiarow wieksza niz 300!");
            return false;
        }

        if (parcel.getzLength() < 30) {
            System.out.println("Wymiar z jest nieprawidłowy (" + parcel.getzLength() + ")!");
            return false;
        }

        if (parcel.getxLength() < 30) {
            System.out.println("Wymiar x jest nieprawidłowy (" + parcel.getxLength() + ")!");
            return false;
        }

        if (parcel.getyLength() < 30) {
            System.out.println("Wymiar y jest nieprawidłowy (" + parcel.getyLength() + ")!");
            return false;
        }

        if (!parcel.isExpress() && parcel.getWeight() > 30) {
            System.out.println("Przekroczyles wage 30kg: " + parcel.getWeight());
            return false;
        }

        if (parcel.isExpress() && parcel.getWeight() > 15) {
            System.out.println("Przekroczyles wage 15kg: " + parcel.getWeight());
            return false;
        }

        return true;
    }
}
