package pl.sda.mg.jav110.jzp.zad6;

import java.util.TreeMap;

public class TreeMapMain {

    public static void main(String[] args) {
        TreeMap<String, String> sampleMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER.reversed());
        sampleMap.put("aaa", "as");
        sampleMap.put("aaa", "ww");
        sampleMap.put("aaa", "we");
        sampleMap.put("aba", "ad");
        sampleMap.put("zab", "ae");
        sampleMap.put("zac", "ae");
        sampleMap.put("zz", "ae");
        sampleMap.put("za", "ae");
        sampleMap.put("ds", "12");
        printElements(sampleMap);
    }

    private static void printElements(TreeMap<String, String> map) {
        System.out.println("First element: " + map.firstEntry());
        System.out.println("Last element: " + map.lastEntry());
    }
}
