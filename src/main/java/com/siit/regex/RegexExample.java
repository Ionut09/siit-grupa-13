package com.siit.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

    public static void main(String... args) {
        String textoSearch =
                "Most enterprise projects set up a binary repository available only within an intranet. In-house repositories enable teams to publish internal binaries, setup user management and security measure and ensure uptime and availability. Specifying a custom URL is also helpful if you want to declare a less popular, but publicly-available repository.\n" +
                        "Repositories with custom URLs can be specified as Maven or Ivy repositories by calling the corresponding methods available on the RepositoryHandler API. Gradle supports other protocols than http or https as part of the custom URL e.g. file, sftp or s3. For a full coverage see the section on supported repository types.\n" +
                        "You can also define your own repository layout by using ivy { } repositories as they are very flexible in terms of how modules are organised in a repository.\n" +
                        "Declaring multiple repositories" +
                        "You can define more than one repository for resolving dependencies. Declaring multiple repositories is helpful if some dependencies are only available in one repository but not the other. You can mix any type of repository described in the reference section.\n" +
                        "This example demonstrates how to declare various named and custom URL repositories for a project:";

        Pattern pattern = Pattern.compile("[A-Z][a-z]+");
//        LocalDate date = DateTimeFormatter.ofPattern()

        String[] inputs = {"Most", "Enterprise", "projects"};
        for (String input : inputs) {
            Matcher matcher = pattern.matcher(input);
            var matches = matcher.matches();
            System.out.println(input + "--> matches = " + matches);
        }

    /*
     (Robert)[0-9]+
     [a-zA-Z] --> orice caracter litera
     [a-zA-Z]+
     \w
     \d
     \s

     */
    }
}
