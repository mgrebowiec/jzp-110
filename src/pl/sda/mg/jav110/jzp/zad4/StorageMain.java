package pl.sda.mg.jav110.jzp.zad4;

public class StorageMain {

    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.addToStorage("first", "FIRST");
        storage.addToStorage("first", "First");
        storage.addToStorage("third", "second");
        storage.addToStorage("second", "SECOND");
        storage.addToStorage("second", "second");

        System.out.println("#1");
        storage.printValues("first");

        System.out.println("#2");
        storage.findKeys("second");
    }
}
