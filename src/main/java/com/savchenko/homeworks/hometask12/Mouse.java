package com.savchenko.homeworks.hometask12;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode

public class Mouse {

    private String name;
    private int numberOfKilocalories;

    public Mouse(String name, int numberOfKilocalories) {
        this.name = name;
        this.numberOfKilocalories = numberOfKilocalories;
    }
}
