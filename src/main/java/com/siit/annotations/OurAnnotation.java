package com.siit.annotations;

import org.springframework.stereotype.Component;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;

@Target({ElementType.TYPE, METHOD, FIELD, ANNOTATION_TYPE})
@Retention(value = RetentionPolicy.RUNTIME)
@Component //pt a extinde functionalitatea unei annotari o punem pe anotarea noastra
//@Inherited
@Documented //--> face ca annotarea sa apara in docs create de javadoc
public @interface OurAnnotation {

    String type() default "type";
}
