package com.siit.exceptions;

import lombok.SneakyThrows;

public class PlayWithExceptions {

    @SneakyThrows(OurCustomCheckedException.class)
    public static void main(String... args)  {
        new PlayWithExceptions().dangerousMethod();
    }

    public void dangerousMethod() throws OurCustomCheckedException {  //declare,  the method client will be forced to handle or declare again

        //handle
        try {
            throw new OurCustomCheckedException("We are fucked up");//handle or declare
        } catch (OurCustomCheckedException e) {
            System.out.println(e.getMessage());
        }

//        throw vs throws --> interviu
    }

}
