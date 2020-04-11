package com.siit.generics;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Box<T> { //<> diamond operator, conventia e ca generica sa aib o litera
    T content;

    public Box(T content) {
        this.content = content;
    }
}
