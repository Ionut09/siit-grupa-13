package com.siit.oop.farmacy;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = true)
public class Analgezic extends Medicine {

    private String actionPoint;

    public Analgezic(String name, String actionPoint) {
        super(name);
        this.actionPoint = actionPoint;
    }
//    public Analgezic(String actionPoint) {
//        this.actionPoint = actionPoint;
//    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o){
//            return true;
//        }
//        if (o == null || !(o instanceof Analgezic)){
//            return false;
//        }
//        Analgezic analgezic = (Analgezic) o;
//        return actionPoint.equals(analgezic.actionPoint);
//    }
//
//    @Override
//    public int hashCode() { //tb sa contina aceleasi campuri ca equals, sa fie consistente
//        return Objects.hash(actionPoint);
//    }

//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Analgezic)) return false;
//        if (!super.equals(o)) return false;
//        Analgezic analgezic = (Analgezic) o;
//
//        //@EqualsAndHashCode(callSuper = true)
//        return getName().equals(analgezic.getName()) &&
//                actionPoint.equals(analgezic.actionPoint);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(super.hashCode(), actionPoint);
//    }
}
