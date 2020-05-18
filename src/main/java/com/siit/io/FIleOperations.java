package com.siit.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.stream.Collectors;

public class FIleOperations {

    public static void main(String... args) throws IOException {
        File file = new File("files");
        File fileWithWindowsPath = new File("E:\\java\\cursuri");
        String sep = File.separator;
        File fileWithWindows = new File("E:" + sep + "java" + sep + "cursuri");

        System.out.println(file.isDirectory()); //true
        System.out.println(file.isFile()); //false
        System.out.println(LocalDateTime.ofEpochSecond(file.lastModified(), 0, ZoneOffset.UTC).format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println(file.exists()); //true
        System.out.println(file.getName()); //files
        System.out.println(Arrays.toString(file.listFiles())); //files

        new File("un_folder_creat_din_java/alt_folder").mkdirs();

        //Path vs Paths
        Path path = Paths.get("un_folder_creat_din_java", "alt_folder", "text_file.txt");
        System.out.println(path.toString());
        path.toFile().createNewFile();
        Files.delete(path);
        Files.createFile(path);
//        Files.move(Paths.get("files/example_maps.txt"),
//                Paths.get("un_foder_creat_din_java/alt_folder/example_maps.txt"),
//                REPLACE_EXISTING);

        Files.lines(Paths.get("un_folder_creat_din_java/alt_folder/example_maps.txt"))
             .peek(System.out::println)
             .map(String::toUpperCase)
             .collect(Collectors.toList());


        //ls <==> dir
        Path projectRoot = Paths.get("./");
//        projectRoot = projectRoot.getParent();
        System.out.println("projectRoot="+projectRoot);
        Files.walk(projectRoot, 1) //Stream<Path>
             .map(Path::normalize)
             .map(Path::toAbsolutePath)
             .forEach(System.out::println);
    }
    /*

    un_foder_creat_din_java/alt_folder/../../ <=> ./
     */
}
