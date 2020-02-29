package com.siit.importedLibrary;

import org.apache.commons.lang3.StringUtils;

public class Ex {

    public static void main(String... args) {
        boolean notBlank = StringUtils.isNotBlank("iedoen");

        System.out.println(notBlank);
    }
}
