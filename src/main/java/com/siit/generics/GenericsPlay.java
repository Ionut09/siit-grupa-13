package com.siit.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsPlay {

    public static void main(String... args) {
//        Box box = new Box("present");
//
//        Object content = box.getContent();
//
//        if(content instanceof String) {
//            String myContent = (String) content;
//        }

        Box<String> box = new Box<>("present");
        String content = box.getContent();


        List rawList = new ArrayList();
        rawList.add(1);
        rawList.add("string");
        rawList.add(new ArrayList());
        rawList.add(box);

        Object o = rawList.get(0);
        int first = (Integer) o;

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10000);
        list.add(10000);
//        list.add("string");
//        list.add(new ArrayList());
//        list.add(box);

        Integer integer = list.get(2);

        Team<FootballPlayer> footballTeam = new Team<>();
        try {
            footballTeam.addPlayer(new FootballPlayer("Beckham"));
            System.out.println("xasijdnisjdnajks");
            footballTeam.addPlayer(new FootballPlayer("Messi"));

            Team<BascketPlayer> bascketTeam = new Team<>();
            bascketTeam.addPlayer(new BascketPlayer("Jordan"));
            bascketTeam.addPlayer(new BascketPlayer("Lebrom james"));
            bascketTeam.addPlayer(new BascketPlayer("O'neil"));

        } catch (ArithmeticException ex) {
            System.out.println("A crapat, dar nu primim stacktrace, pt ca am prins-o");
        }
        System.out.println("some code");
        //daca punem Pig, --> Type parameter '? extends Pig' is not within its bound; should extend 'com.siit.generics.Player'
        Team<? extends Object> genericTeam1 = new Team<FootballPlayer>();
        genericTeam1 = new Team<BascketPlayer>();

//        Team<Pig> team = new Team<Pig>();//eraore pt ca am adaugat upper bound = T extends SuperClass/Interface

    }
}
