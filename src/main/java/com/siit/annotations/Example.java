package com.siit.annotations;

import com.siit.oop.builder.PartTimeEmployee;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {

    public static void main(String... args) {
        Class<PartTimeEmployee> employeeClass = PartTimeEmployee.class;

        Annotation[] annotations = employeeClass.getAnnotations();

        System.out.println(Arrays.toString(annotations));
        List<Annotation> annotationList = Arrays.stream(annotations)
                                                .collect(Collectors.toList());

        if(annotationList.contains("lombok.AllArgsConstructor")){
//           insert builder in compiled code
        }

    }
}
