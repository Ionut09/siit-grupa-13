package com.siit.lambdas;

import com.siit.oop.inheritance.Animal;
import com.siit.oop.inheritance.Dog;

import org.apache.commons.lang3.StringUtils;

import java.util.function.Predicate;

public class TestLambdas {

    public static void main(String... args) {

        AnimalFeatureTest animalFeatureTest = (Animal a) -> {
            return a.getSpecies().equals("canine");
        };

        AnimalFeatureTest animalFeatureTest1 = (a) -> a.getSpecies().equals("canine");

        AnimalFeatureTest testAnimalIsCanine = new AnimalFeatureTest() {
            @Override
            public boolean testAnimal(Animal a) {
                return a.getSpecies().equals("canine");
            }
        };

        //doar am implementat testAnimal
        AnimalFeatureTest testAnimalIsFeline = a -> a.getSpecies().equals("feline");

        testAnimalIsCanine.testAnimal(new Dog());


        String str = "qwertyuio";
        Predicate<String> predicate = s -> str.startsWith(s);
        predicate = str::startsWith;

        System.out.println(predicate.test("qw"));

        predicate = s -> s.isEmpty();
        predicate = String::isEmpty;

        predicate = StringUtils::isEmpty;
        predicate = cs -> StringUtils.isEmpty(cs);
    }
}
