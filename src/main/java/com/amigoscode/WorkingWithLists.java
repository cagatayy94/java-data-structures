package com.amigoscode;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {

        List<String> colorsUnmodifiable = List.of(
                "Blue",
                "Red",
                "Yellow"
        );

        colorsUnmodifiable.add("sadasd");

        List<String> colors =  new ArrayList<>();

        colors.add("Blue");
        colors.add("Purple");
        colors.add("Yellow");

        System.out.println(colors.size());
        System.out.println(colors.contains("Yellow"));
        System.out.println(colors.contains("Green"));
        System.out.println(colors);

        for (String color : colors){
            System.out.println(color);
        }

        colors.forEach(System.out::println);

        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

    }
}
