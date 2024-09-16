package com.java8.function;

import java.util.function.Function;

public class FunctionL {
    static Function<String, String> function1 = name -> name;
    static Function<String, String> function2 = name -> name.toUpperCase().concat("features");

    public static void main(String[] args) {
        System.out.println("Result 1:" + function1.apply("java"));
        System.out.println("Result 2 " + function2.apply("java"));

        System.out.println("And then result " + function1.andThen(function2).apply("java"));
        System.out.println("Compose result " + function1.compose(function2).apply("java"));

    }
}
