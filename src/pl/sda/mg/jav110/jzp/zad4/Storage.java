package pl.sda.mg.jav110.jzp.zad4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {
    private Map<String, List<String>> map = new HashMap<>();

    public Storage() {

    }

    public void addToStorage(String key, String value) {
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }

        map.get(key).add(value);
    }

    public void printValues(String key) {
        System.out.println("Storage:");
        for(Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey().equals(key)) {
                System.out.printf("[KEY: %s, VALUES: [%s]]\n", entry.getKey(), entry.getValue());
            }
        }
    }

    public void findKeys(String value) {
        System.out.println("All keys for value: " + value);
        for(Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getValue().contains(value)) {
                System.out.printf("%s, ", entry.getKey());
            }
        }
        System.out.println("\n----------------------------------------");
    }
}
