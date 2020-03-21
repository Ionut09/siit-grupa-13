package com.siit.oop.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    public static void main(String... args) {
        List<Animal> animals = new ArrayList<Animal>();

        //CRUD
        Cat cat = new Cat("Pisi");
        animals.add(cat);
        Dog dog = new Dog();
        animals.add(dog);
        Hawk hawk = new Hawk();
        animals.add(hawk);

        Animal animal = animals.get(0); //asa il vede javac

        if (animal instanceof Cat) {
            //cast, merge doar daca in spatele lui animal se afla un Cat
            Cat catCasted = (Cat) animal;
            catCasted.meew();
        }

        Animal animal1 = animals.get(1);
//        Cat dogyCat = (Cat) animal1; //java.lang.ClassCastException
        if (animal1 instanceof Cat) { //ma asigur ca fac un cast valid
            Cat dogyCat = (Cat) animal1;
            dogyCat.move();
        }

        for (Animal eachAnimal : animals) {
            System.out.println(eachAnimal instanceof Cat);
        }
        Cat cat1 = new Cat("Pisi");
        int indexOfCat = animals.indexOf(cat1);
        System.out.println("indexOfCat = " + indexOfCat);

        for (Animal animal2 : animals) {
            System.out.println(animal2);
        }

        animals.set(0, new Cat("Miti"));//inlocuim pe pisi cu miti

        boolean containsMiti = animals.contains(new Cat("Miti"));
        System.out.println("containsMiti = " + containsMiti);

        animals.remove(new Cat("Miti"));
        int size = animals.size();//dimensiunea listei
        for (Animal animal2 : animals) {
            System.out.println(animal2);
            //echivalent cu
//            System.out.println(animal2.toString());
        }

        //pt ca referinta an este de tip ANimal
        Animal an = new Cat();
        an = new Dog();
        an = new Hawk();
        an.move();

    }
}
