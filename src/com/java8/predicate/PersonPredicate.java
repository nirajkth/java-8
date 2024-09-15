package com.java8.predicate;

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.List;

import com.java8.repo.Person;
import com.java8.repo.PersonRepository;

public class PersonPredicate {
    public static void main(String[] args) {
        Predicate<Person> predicate1 = Person -> Person.getHeight() > 180;
        Predicate<Person> predicate2 = Person -> Person.getGender().equalsIgnoreCase("Male");

        List<Person> persons = PersonRepository.getPersons();

        persons.stream().filter(predicate1).collect(Collectors.toList());

        persons.forEach(person -> {
            if (predicate1.and(predicate2).test(person)) {
                System.out.println(person);
            }
        });
    }
}
