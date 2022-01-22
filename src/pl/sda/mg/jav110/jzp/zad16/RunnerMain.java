package pl.sda.mg.jav110.jzp.zad16;

public class RunnerMain {
    public static void main(String[] args) {
        Runner existingRunner = Runner.getFitnessLevel(245);
        System.out.println("Poziom dla czasu 245: " + existingRunner);

        Runner nonExistingRunner = Runner.getFitnessLevel(1);
        System.out.println("To sie nie wyswietli");
    }
}
