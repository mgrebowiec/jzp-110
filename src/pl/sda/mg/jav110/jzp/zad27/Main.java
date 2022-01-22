package pl.sda.mg.jav110.jzp.zad27;

public class Main {
    public static void main(String[] args) {
        Joiner<Integer> integerJoiner = new Joiner<>(";");
        System.out.println(integerJoiner.join(1, 2, 3, 4, 5));
    }
}
