package com.amigoscode;

import java.util.HashSet;
import java.util.Set;

public class WorkingWithSets {
    public static void main(String[] args) {
        Set<Ball> ballSet = new HashSet<>();

        ballSet.add(new Ball("blue"));
        ballSet.add(new Ball("blue"));
        ballSet.add(new Ball("yellow"));
        ballSet.add(new Ball("red"));

        ballSet.forEach(System.out::println);
    }

    static class Ball{
        String color;
        public Ball(String color) {
            this.color = color;
        }
    }

    //record Ball(String color){};
}
