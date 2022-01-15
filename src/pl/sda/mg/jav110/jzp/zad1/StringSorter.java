package pl.sda.mg.jav110.jzp.zad1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StringSorter {

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("Asd", "sss", "bab", "zas", "Nam", null);
//        myList.sort(String.CASE_INSENSITIVE_ORDER.reversed());
        myList.sort(Comparator.nullsFirst(new MyOwnComparator()).reversed());
        System.out.println(myList);
    }

    private static class MyOwnComparator implements Comparator<String> {

        @Override
        public int compare(String s, String t1) {
            return s.compareToIgnoreCase(t1);
        }
    }
}
