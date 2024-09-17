package com.java8.methodreference;

import java.util.function.Function;

public class MethodReferenceL1 {
    static Function<String, String> function1 = name -> name.toUpperCase();
    static Function<String, String> function2 = String::toUpperCase;
    MethodReference methodReference = new MethodReference();

    public static void main(String[] args) {
        System.out.println("Result 1 " + function1.apply("java"));
        System.out.println("Result 2 " + function2.apply("java features"));
    }

}
