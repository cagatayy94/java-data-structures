package com.amigoscode;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "Purple";
        colors[1] = "Blue";

        System.out.println(Arrays.toString(colors));

        int[] numbers = {100, 200};

        for (int number : numbers) {
            System.out.println(number);
        }

        Arrays.stream(colors).forEach(System.out::println);

        Arrays.sort(colors);


    }
}
