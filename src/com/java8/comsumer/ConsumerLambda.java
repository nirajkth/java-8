package com.java8.comsumer;

import java.util.function.Consumer;

public class ConsumerLambda {
    public static void main(String[] args) {
        Consumer<String> nameConsumer1 = name -> System.out.println(name.toUpperCase());
        // nameConsumer1.accept("java8");

        Consumer<String> nameConsumer2 = name -> System.out.println(name.toLowerCase());
        // nameConsumer2.accept("java8");

        nameConsumer1.andThen(nameConsumer2).accept("java8");
    }
}
