package com.siit.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.Data;

@Data
public class Team<T extends Player> {
    //extends = upper bound --> T va putea fi Player, sau orice subclasa de-a ei
    // super = lower bound


    int score;

    List<T> players = new ArrayList<>();

    public boolean addPlayer(T player) {
        Double d = 9.0; //9-->Integer
        Float f = 9.5f;
        players = Collections.unmodifiableList(players);

        if (players.contains(player)) {
            System.out.println("Player is already selected for the team");
            return false;
        } else {
            players.add(player);
            System.out.println("Player" + player.getName() + " added to team");
            throw new RuntimeException(" Uff , a crapat");
        }
    }

    public static <E extends Player> void genericMethod(E obj) {
        System.out.println(obj);
    }

    public static void rtti(List<Integer> list) {
//        instanceof nu poate verifica tipul genericei
        if (list instanceof ArrayList<?>) { // OK; instanceof requires a reifiable type // ... }
        }
    }
}
