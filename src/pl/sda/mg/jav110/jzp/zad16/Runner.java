package pl.sda.mg.jav110.jzp.zad16;

import java.util.stream.Stream;

public enum Runner {
    BEGINNER(200, 500),
    INTERMEDIATE(100, 199),
    ADVANCED(20, 99);

    private int minTime;
    private int maxTime;

    Runner(int minTime, int maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    public static Runner getFitnessLevel(int time) {
        return Stream.of(values())
                .filter(runner -> runner.minTime <= time && runner.maxTime >= time)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Nie ma odpowiedniego poziomu dla czasu: " + time));
    }
}
