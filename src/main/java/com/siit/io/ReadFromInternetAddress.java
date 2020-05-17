package com.siit.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.URL;

public class ReadFromInternetAddress {

    public static void main(String... args) throws IOException {
        Socket socket = new Socket("www.google.com", 80);
        InputStream inputStream = socket.getInputStream();
        PrintWriter writer = new PrintWriter(socket.getOutputStream());
        writer.println("GET / HTTP/1.0");
        writer.println();
        writer.flush();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
             BufferedWriter buff = new BufferedWriter(new FileWriter("files/google.html", true))) {
            String line;
            while ((line = reader.readLine()) != null) {
                buff.write(line);
            }

        } finally {
            socket.close();
        }

        //but, in our days
        URL url = new URL("https://www.google.com/");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        }

//        restteamplate restTemplet = new resttemplate("\"https://www.google.com/\"");
//        Images images = restTemplet.get("/images");
    }

}
