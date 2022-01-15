package pl.sda.mg.jav110.jzp.zad3;

import java.util.*;

public class MapPrinter {

    public static void main(String[] args) {
        Map<String, Integer> sampleMap = new TreeMap<>();
        sampleMap.put("aaa", 1);
        sampleMap.put("bbb", 2);
        sampleMap.put("a", 3);
        sampleMap.put("d", 6);
        sampleMap.put("qw", 3);

        printMap(sampleMap);
        System.out.println("Print with iterator:");
        printMapWithIterator(sampleMap);
    }

    private static void printMapWithIterator(Map<String, Integer> map) {
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            StringBuilder row = new StringBuilder("Klucz: ");
            row.append(entry.getKey()).append(", Wartosc: ").append(entry.getValue());
            if (iterator.hasNext()) {
                row.append(",");
            } else {
                row.append(".");
            }
            System.out.println(row);
        }
    }

    private static void printMap(Map<String, Integer> map) {
        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        int rowNumber = 1;
        for(Map.Entry<String, Integer> entry : entries) {
            StringBuilder row = new StringBuilder("Klucz: ");
            row.append(entry.getKey()).append(", Wartosc: ").append(entry.getValue());
            if (rowNumber == entries.size()) {
                row.append(".");
            } else {
                row.append(",");
            }
            System.out.println(row);
            rowNumber++;
        }
    }
}
