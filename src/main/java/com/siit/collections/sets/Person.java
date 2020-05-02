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

    private final String name;

    @EqualsAndHashCode.Include //equals o sa compare doar CNP-ul
    private final String cnp;

    @EqualsAndHashCode.Include
    private int age;

    //This was before lombok
//    @Override
//    public boolean equals(Object comparedPerson) {
//        if (!(comparedPerson instanceof Person)) return false;
//
//        Person person = (Person) comparedPerson;
//
//        return this.getCnp().equals(person.getCnp()) && this.getage==person.age;
//    }
//
//    @Override
//    public int hashCode() {
//        return cnp.hashCode();
//    }

    //person.compareTo(anotherPerson)
    @Override
    public int compareTo(Person o) {

        int compare = this.getName().compareTo(o.getName());
        if (compare == 0) {

        }
        return compare;
    }
}
