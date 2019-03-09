package com.mytest.data;

import lombok.*;

@lombok.Getter
@lombok.Setter

@Builder(toBuilder = true)
@ToString
@EqualsAndHashCode
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Hero
{
    @Getter @Setter private String name;
    @Getter @Setter private Integer id;

    public Hero() {
    }
}
