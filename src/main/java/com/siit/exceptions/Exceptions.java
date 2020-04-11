package com.siit.exceptions;

import com.siit.generics.FootballPlayer;
import com.siit.generics.Team;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Exceptions {

    public static void main(String... args) throws SQLException {
        Team<FootballPlayer> footballTeam = new Team<>();
        try {
            footballTeam.addPlayer(new FootballPlayer("Beckham"));
            System.out.println("xasijdnisjdnajks");

        } catch (Exception ex) {
            System.out.println("A crapat, dar nu primim stacktrace, pt ca am prins-o");
        } finally {
            System.out.println("Uite ca finally se executa mereu");
        }


        Connection con = null;
        try {
//            con = DriverManager.getConnection("jdbc:lamkjskh");
//            footballTeam.addPlayer(new FootballPlayer("Beckham"));
            System.out.println("xasijdnisjdnajks");

        } finally { //se poate si fara catch
            System.out.println("Uite ca finally se executa mereu");
//            con.close();
        }
        System.out.println("some code");

        //dar incepand cu Java 7 facem asa....

        //try-with-resources
        //EHM tb sa stie sigur ca resursele au metoda close
        try (Connection connection = DriverManager.getConnection("url");
             ResursaNoastra res = new ResursaNoastra()) {

        }//poate sa nu contina catch

        try (ResursaNoastra res = new ResursaNoastra()) {

        }

    }
}
