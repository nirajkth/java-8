package com.java8.function;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

import com.java8.repo.Person;
import com.java8.repo.PersonRepository;

public class FunctionPerson {
    static Function<String, Integer> function1 = name -> name.length();

    static Predicate<Person> p1 = per -> per.getHeight() >= 140;
    static Predicate<Person> p2 = per -> per.getGender().equals("Male");

    static Function<List<Person>, Map<String, Double>> function2 = personList -> {
        Map<String, Double> map = new HashMap<String, Double>();
        personList.forEach(person -> {
            if (p1.and(p2).test(person))
                map.put(person.getName(), person.getSalary());
        });
        return map;
    };

    public static void main(String[] args) {
        // Integer result = function1.apply("java 8 features");
        // System.out.println(result);
        List<Person> persons = PersonRepository.getPersons();
        Map<String, Double> personNameAndSalary = function2.apply(persons);
        System.out.println(personNameAndSalary);
    }
}
