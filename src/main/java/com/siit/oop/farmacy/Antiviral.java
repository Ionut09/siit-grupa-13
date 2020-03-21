package com.siit.oop.farmacy;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = true)
public class Antiviral extends Medicine {

    private String spectre;

    public Antiviral(String name, String spectre) {
        super(name);
        this.spectre = spectre;
    }


    //    private String fullname;
//
//    public static void main(String... args) {
//        Antiviral antiCorona = new Antiviral().setFullname("Anti corona")
//                                              .setSpectre("COVID-19");
//
//    }
//
//    public String getSpectre() {
//        return spectre;
//    }
//
//    public Antiviral setSpectre(String spectre) {//this e obiectul care a apelat metoda de instanta
//        this.spectre = spectre;
//        return this;
//    }
//
//
//    public Antiviral setFullname(String fullname) {
//        this.fullname = fullname;
//        return this;
//    }
}
