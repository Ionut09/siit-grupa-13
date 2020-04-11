package com.siit.test1;

class Bird {

    {
        System.out.println("b1 ");
    }

    public Bird() {
        System.out.println("b2 ");
    }
}

class Raptor extends Bird {

    static {
        System.out.println("r1 ");
    }

    public Raptor() {
        System.out.println("r2 ");
    }

    {
        System.out.println("r3 ");
    }

    static {
        System.out.println("r4 ");
    }
}

class Hawk extends Raptor {

    public static void main(String[] args) {
        System.out.println("pre ");
        Hawk hawk = new Hawk();
        System.out.println("hawk ");
        String s = hawk.doSome();
        System.out.println(s);
    }

    private String doSome() {
        return "iwu" + "jsnsd";
    }
}

