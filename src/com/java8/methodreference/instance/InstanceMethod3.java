package com.java8.methodreference.instance;

import java.util.function.BiFunction;

class Arithmetic {
    public int add(int a, int b) {
        return a + b;
    }
}

public class InstanceMethod3 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> adder = new Arithmetic()::add;
        int result = adder.apply(10, 20);
        System.out.println(result);
    }
}
