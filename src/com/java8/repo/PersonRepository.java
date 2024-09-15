package com.java8.repo;

import java.util.Arrays;
import java.util.List;

public class PersonRepository {
        public static List<Person> getPersons() {
                Person p1 = new Person("Ram", 190, 100000.00, "Male", 6,
                                Arrays.asList("Kabaddi", "Chess", "Badminton"));
                Person p2 = new Person("Shyam", 189, 90000.00, "Male", 4,
                                Arrays.asList("Hockey", "Chess", "Judo"));
                Person p3 = new Person("Rukmini", 160, 60000.00, "Female", 10,
                                Arrays.asList("Polo", "Kabaddi", "Judo"));
                Person p4 = new Person("Radha", 220, 300000.00, "Female", 2,
                                Arrays.asList("Judo", "Polo", "Kabaddi"));

                return Arrays.asList(p1, p2, p3, p4);
        }

        public static Person getPerson() {
                return new Person("Ram", 190, 100000.00, "Male", 6,
                                Arrays.asList("Kabaddi", "Chess", "Badminton"));
        }
}
