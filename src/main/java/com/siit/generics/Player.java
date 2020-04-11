package com.siit.generics;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data //Equivalent to @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode
public abstract class Player {
    private String name;
}
