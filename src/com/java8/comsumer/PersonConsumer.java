package com.java8.comsumer;

import java.util.function.Consumer;

import com.java8.repo.Person;
import com.java8.repo.PersonRepository;

public class PersonConsumer {

    static Consumer<Person> consumer1 = person -> System.out.println(person);
    static Consumer<Person> consumer2 = person -> System.out.println(person.getName().toUpperCase());
    static Consumer<Person> consumer3 = person -> System.out.println(person.getHobbies());

    public static void main(String[] args) {
        Person person = PersonRepository.getPerson();
        // consumer1.accept(person);
        // consumer2.accept(person);
        // consumer3.accept(person);

        consumer1.andThen(consumer2).andThen(consumer3).accept(person);
    }
}
