package com.java8.feature;

import java.util.stream.IntStream;

public class Java7VsJava8 {
    public static void main(String[] args) {
        // Before
        int total = 0;
        for (int i = 0; i < 100; i++) {
            total += i;
        }
        System.out.println("Total using java 7 :" + total);

        // After
        int totalUsingJava8 = IntStream.range(0, 100)
                .map(Integer::new)
                .sum();
        System.out.println("Sum using Java 8: " + totalUsingJava8);

    }
}
