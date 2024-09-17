package com.java8.methodreference;

import java.util.Comparator;

public class MethodReference {

    public static void main(String[] args) {
        System.out.println("Result 1 " + MethodReference.compare(10, 9));

        Comparator<Integer> compare = MethodReference::compare;
        System.out.println("Result 2 " + compare.compare(10, 9));
    }

    public static int compare(Integer x, Integer y) {
        return Integer.compare(x, y);
    }
}
