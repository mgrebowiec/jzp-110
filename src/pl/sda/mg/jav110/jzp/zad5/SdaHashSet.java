package pl.sda.mg.jav110.jzp.zad5;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class SdaHashSet extends AbstractSet<String> {

    private Set<String> sampleSet = new HashSet<>();

    @Override
    public Iterator<String> iterator() {
        System.out.println("Zwracamy iterator");
        return sampleSet.iterator();
    }

    @Override
    public void forEach(Consumer<? super String> action) {
        sampleSet.forEach(action);
    }

    @Override
    public <T> T[] toArray(IntFunction<T[]> generator) {
        return sampleSet.toArray(generator);
    }

    @Override
    public boolean removeIf(Predicate<? super String> filter) {
        return sampleSet.removeIf(filter);
    }

    @Override
    public Spliterator<String> spliterator() {
        return sampleSet.spliterator();
    }

    @Override
    public Stream<String> stream() {
        return sampleSet.stream();
    }

    @Override
    public Stream<String> parallelStream() {
        return sampleSet.parallelStream();
    }

    @Override
    public int size() {
        return sampleSet.size();
    }

    @Override
    public boolean add(String s) {
        return sampleSet.add(s);
    }

    @Override
    public String toString() {
        return sampleSet.toString();
    }
}
