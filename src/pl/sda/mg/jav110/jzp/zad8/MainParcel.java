package pl.sda.mg.jav110.jzp.zad8;

public class MainParcel {

    public static void main(String[] args) {
        Parcel sampleParcel = new Parcel(31, 31, 31, 20, false);
        Validator validator = new ValidatorImpl();
        System.out.println("#1 is valid parcel: " + validator.validate(sampleParcel));

        sampleParcel = new Parcel(31, 31, 31, 20, true);
        System.out.println("#2 is valid parcel: " + validator.validate(sampleParcel));

        sampleParcel = new Parcel(30, 29, 31, 20, true);
        System.out.println("#3 is valid parcel: " + validator.validate(sampleParcel));

        sampleParcel = new Parcel(70, 200, 31, 20, false);
        System.out.println("#4 is valid parcel: " + validator.validate(sampleParcel));
    }
}
