package com.java8.methodreference;

import java.util.function.BiFunction;

class Arithmetic {
    // R apply(T t, U u);
    public static int add(int a, int b) {
        return a + b;
    }
}

public class MethodReference4 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> adder = Arithmetic::add;
        int result = adder.apply(10, 20);
        System.out.println(result);
    }
}
