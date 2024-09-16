package com.java8.supplier;

import java.util.List;
import java.util.function.Supplier;

import com.java8.repo.Person;
import com.java8.repo.PersonRepository;

public class SupplierL {
    static Supplier<Person> s1 = () -> PersonRepository.getPerson();
    static Supplier<List<Person>> s2 = () -> PersonRepository.getPersons();

    public static void main(String[] args) {
        System.out.println(s1.get());
        System.out.println(s2.get());
    }
}
