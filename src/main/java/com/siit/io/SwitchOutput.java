package com.siit.io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class SwitchOutput {

    public static void main(String... args) throws IOException {
        ByteArrayOutputStream output = new ByteArrayOutputStream(16 * 1024);
        PrintStream out = System.out;
        System.setOut(new PrintStream(output));
        //invocati metodele de test
        //faceti assertions pe ce s-a colectat in ByteArrayOutputStream
        System.out.println("One");
        System.out.println("wo");
        System.out.println("askjbs");

//        asserthat(output.toString()).isEqual("[0,1,1,2,3,5,8]");
        String s = output.toString();
        System.setOut(out);
        System.out.println("Only now I can print something to console");
        System.out.println("s = " + s);
    }
}
