package com.siit.collections.sets;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public abstract class Person implements Comparable<Person> {

    private String name;

    @EqualsAndHashCode.Include
    private String cnp;

    private int age;

    //This was before lombok
//    @Override
//    public boolean equals(Object comparedPerson) {
//        if (!(comparedPerson instanceof Person)) return false;
//
//        Person person = (Person) comparedPerson;
//
//        return this.getCnp().equals(person.getCnp());
//    }
//
//    @Override
//    public int hashCode() {
//        return cnp.hashCode();
//    }

    //person.compareTo(anotherPerson)
    @Override
    public int compareTo(Person o) {
        return this.getName().compareTo(o.getName());
    }
}
