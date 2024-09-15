package com.java8.comsumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerL {
    static BiConsumer<Integer, Integer> biConsumer1 = (num1, num2) -> System.out.println("Sum :" + (num1 + num2));

    public static void main(String[] args) {
        biConsumer1.accept(100, 100);

        List<Integer> list1 = Arrays.asList(Integer.valueOf(10), Integer.valueOf(10), Integer.valueOf(10));
        List<Integer> list2 = Arrays.asList(Integer.valueOf(10), Integer.valueOf(10), Integer.valueOf(10));

        BiConsumer<List<Integer>, List<Integer>> biConsumer2 = (l1, l2) -> {
            if (l1.size() == l2.size())
                System.out.println("True");
            else
                System.out.println("False");
        };

        biConsumer2.accept(list1, list2);

        BiConsumer<Integer, Integer> add = (num1, num2) -> System.out.println("Sum " + (num1 + num2));
        BiConsumer<Integer, Integer> sub = (num1, num2) -> System.out.println("Sub " + (num1 - num2));
        BiConsumer<Integer, Integer> mul = (num1, num2) -> System.out.println("Mul " + (num1 * num2));

        // add.accept(100, 200);
        // sub.accept(300, 100);
        // mul.accept(10, 9);

        add.andThen(sub).andThen(mul).accept(200, 100);
    }
}
