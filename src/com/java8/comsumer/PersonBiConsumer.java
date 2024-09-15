package com.java8.comsumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

import com.java8.repo.Person;
import com.java8.repo.PersonRepository;

public class PersonBiConsumer {

    static void printPersonDetails() {
        BiConsumer<String, List<String>> personConsumer = (name, hobbies) -> System.out.println(name + hobbies);
        BiConsumer<String, Double> personSalary = (name, salary) -> System.out.println(name + salary);

        List<Person> persons = PersonRepository.getPersons();

        persons.forEach(person -> {
            personConsumer.accept(person.getName(), person.getHobbies());
            personSalary.accept(person.getName(), person.getSalary());
        });
    }

    public static void main(String[] args) {
        printPersonDetails();
    }
}
