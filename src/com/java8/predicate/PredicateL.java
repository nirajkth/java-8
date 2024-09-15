package com.java8.predicate;

import java.util.function.Predicate;

public class PredicateL {
    public static void main(String[] args) {
        Predicate<Integer> lessThan = num -> num <= 100;
        Predicate<Integer> greaterThan = num -> num >= 100;
        Predicate<Integer> equalTo = num -> num == 0;

        System.out.println(lessThan.test(100));
        System.out.println(greaterThan.test(200));
        System.out.println(equalTo.test(1000));

        System.out.println(lessThan.and(greaterThan).and(equalTo).test(100));
        System.out.println(lessThan.or(greaterThan).or(equalTo).test(100));
        System.out.println(lessThan.or(greaterThan).negate().test(100));

    }
}
