package ua.lviv.lgs.part2;

import java.util.*;
import java.util.Map.Entry;

public class myMap<K, V> {
    private Map<K, V> map = new HashMap<>();

    public myMap() {

    }

    public void add(K key, V value) {
        map.put(key, value);
    }

    public void removeKey(K key) {
        Iterator<Entry<K, V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<K, V> entry = (Map.Entry<K, V>) iterator.next();
            // Entry next = iterator.next ( );
            if (entry.getKey().equals(key)) {
                iterator.remove();
                System.out.println(entry.getKey() + " was removed");
            }
        }
        System.out.println();
    }

    public void removeValue(V value) {
        Iterator<Entry<K, V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<K, V> entry = (Map.Entry<K, V>) iterator.next();
            if (entry.getValue().equals(value)) {
                iterator.remove();
                System.out.println(entry.getValue() + " was removed");
            }
        }
        System.out.println();
    }

    public void setOfKeys() {
        Set<K> setKeys = new HashSet<>();
        Iterator<Entry<K, V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<K, V> entry = (Map.Entry<K, V>) iterator.next();
            setKeys.add(entry.getKey());
        }
        System.out.println("Set of keys: " + setKeys);

        System.out.println();
    }

    public void listOfValues() {
        List<V> listValues = new ArrayList<>();
        Iterator<Entry<K, V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<K, V> entry = (Map.Entry<K, V>) iterator.next();
            listValues.add(entry.getValue());
        }
        System.out.println("List of values: " + listValues);

        System.out.println();
    }

    public void viewMap() {
        Iterator<Entry<K, V>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<K, V> entry = (Map.Entry<K, V>) iterator.next();
            System.out.println("Key is: " + entry.getKey() + " Value is: " + entry.getValue());
        }
        System.out.println();
    }

}
