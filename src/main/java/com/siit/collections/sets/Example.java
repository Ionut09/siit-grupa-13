package com.siit.collections.sets;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Example {

    public static void main(String... args) {
        Employee john = Employee.builder()
                                .name("John")
                                .age(29)
                                .cnp("190121292829182")
                                .salary(3000)//euro --> net
                                .build();

        Employee john2 = Employee.builder()
                                 .name("John")
                                 .age(29)
                                 .cnp("190121292829182")
                                 .salary(3000)//euro --> net
                                 .build();

        Employee john3 = Employee.builder()
                                 .name("John")
                                 .age(29)
                                 .cnp("190121292829184")
                                 .salary(3000)//euro --> net
                                 .build();

        Set<Person> citizens = new HashSet<>();

        Student alex = Student.builder()
                              .name("Alex")
                              .cnp("19590998293208")
                              .scholarship(700)
                              .build();

        Unemployed bob = Unemployed.builder()
                                   .name("Bob")
                                   .cnp("1959099828738228")
                                   .welfare(500)
                                   .build();
        citizens.add(alex);
        citizens.add(bob);


        System.out.println(citizens.add(john));
        System.out.println(citizens.add(john2));
        System.out.println(citizens.add(john3));

        citizens.forEach((citizen) -> {
//            System.out.println(citizen.getName() +" "+ citizen.getCnp());
            System.out.println(citizen);
        });

        Comparator<Person> personComparatorAfterNameAndAge = new Comparator<>() {

            @Override
            public int compare(Person o1, Person o2) {
                int i = o1.getName().compareTo(o2.getName());
                if (i == 0) {
                    if (o1.getAge() == o2.getAge()) {
                        return 0;
                    } else if (o1.getAge() < o2.getAge()) {
                        return 1;
                    } else {
                        return -1;
                    }
                }
                return i;
            }
        };

//      int compare(T o1, T o2);
        Comparator<Person> personComparatorAfterCnp = (person1, person2) -> person1.getCnp().compareTo(person2.getCnp());

        //String apply(Person p)
        Comparator<Person> personComparatorAfterCnp1 = Comparator.comparing(person -> person.getCnp());
        //echiv cu
        Comparator<Person> personComparatorAfterCnp2 = Comparator.comparing(Person::getCnp);

        SortedSet<Person> sortedCitizens = new TreeSet<>(personComparatorAfterCnp); //cand Person nu implementeaza Comparable
        sortedCitizens = new TreeSet<>();                                           //cand Person  implementeaza Comparable
        sortedCitizens.addAll(citizens);

        sortedCitizens.forEach((citizen) -> {
            System.out.println(citizen.getName());
        });

        System.out.println(sortedCitizens.first()); //Alex
        System.out.println(sortedCitizens.last()); //John

        NavigableSet<Person> sortedCitizens1 = (TreeSet<Person>) sortedCitizens;

        Person person = sortedCitizens1.ceiling(alex);//>= --> Alex
        System.out.println("person = " + person);

        person = sortedCitizens1.higher(alex);  //> --> BOB
        System.out.println("person = " + person);

        person = sortedCitizens1.floor(alex);  //<=  --> Alex
        System.out.println("person = " + person);

        person = sortedCitizens1.lower(alex);  //<   --> null
        System.out.println("person = " + person);


        LinkedHashSet<Person> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(john);
        linkedHashSet.add(alex);
        linkedHashSet.add(bob);
        linkedHashSet.add(john3);

        linkedHashSet.forEach((pers) -> System.out.println(pers.getName()));
    }
}
