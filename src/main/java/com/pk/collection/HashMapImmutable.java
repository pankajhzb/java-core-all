package com.pk.collection;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapImmutable {
    public static void main(String[] args) {

        // Singleton Map - Immutable Map (It can not be change)- Only one Single Value
        Map<String, Integer> map11 = Collections.singletonMap("test", 100);
        System.out.println(map11.get("test"));
        map11.put("test2", 200); // Unsupported Operation exception

        //
        Map<String, String> map = Stream.of(new String[][]
                {
                        {"Tom", "A Grade"},
                        {"Lisa", "A+ Grade"}
                }).collect(Collectors.toMap(data -> data[0], data -> data[1]));

        // Using simple entry, Mutable Map
        Map<String, String> map1 = Stream.of(
                new AbstractMap.SimpleEntry<>("A", "a"),
                new AbstractMap.SimpleEntry<>("B", "b")
        ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(map1.get("A"));

    }
}
