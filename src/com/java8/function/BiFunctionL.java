package com.java8.function;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.java8.repo.Person;
import com.java8.repo.PersonRepository;

public class BiFunctionL {
    static BiFunction<String, String, String> biFunction1 = (a, b) -> (a + " " + b);

    static Predicate<Person> p1 = per -> per.getHeight() >= 140;
    static Predicate<Person> p2 = per -> per.getGender().equals("Male");

    static BiFunction<List<Person>, Predicate<Person>, Map<String, Double>> biFunction2 = (personList, predicate) -> {
        Map<String, Double> map = new HashMap<String, Double>();
        personList.forEach(per -> {
            if (p1.and(p2).test(per)) {
                map.put(per.getName(), per.getSalary());
            }
        });
        return map;
    };

    public static void main(String[] args) {
        // System.out.println("Result " + biFunction1.apply("java", "features"));
        List<Person> persons = PersonRepository.getPersons();
        Map<String, Double> map = biFunction2.apply(persons, p2);
        System.out.println(map);
    }
}
