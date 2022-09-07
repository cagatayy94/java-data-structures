package com.amigoscode;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();

        map.put(1, new Person("Alex"));
        map.put(2, new Person("Alexa"));
        map.put(3, new Person("Ali"));
        map.put(3, new Person("Ali 2"));

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(2));
        System.out.println(map.containsKey(5));
        System.out.println(map.containsValue(new Person("Alex")));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());

        map.entrySet().forEach(x -> System.out.println(x.getKey()+" "+x.getValue()));

        map.remove(3);

        map.forEach(((key, value) -> {
            System.out.println(key+" "+value);
        }));

        System.out.println(map.getOrDefault(3, new Person("default")));

        System.out.println(map.values());
    }

    record Person(String name){}
}
