package com.savchenko.homeworks.hometask8;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString

public enum Genre {

    FAIRY_TALE("Fairy tale"), CLASSIC("Classic"), EPIC("Epic"), HORROR("Horror"), MYSTERY("Mystery"), BIOGRAPHY("Biography"), ROMANCE("Romance"), DRAMA("Drama"), CRIME("Crime");

    private final String displayName;
}

