package com.siit.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharacterIO {

    public static void main(String... args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("files/example_maps.txt")), 10000000);
             BufferedWriter writer = new BufferedWriter(new FileWriter("files/output.txt", true))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
//                +"\n");
                writer.newLine();
            }

        } catch (IOException ex) {
            System.out.println("Exception");
        }

    }
}
