package com.savchenko.homeworks.hometask8;

public enum Genre {
    FAIRY_TALE("Fairy tale"), CLASSIC("Classic"), EPIC("Epic"), HORROR("Horror"), MYSTERY("Mystery"), BIOGRAPHY("Biography"), ROMANCE("Romance"), DRAMA("Drama"), CRIME("Crime");

    private String displayName;

    Genre(String displayName) {
        this.displayName = displayName;
    }

    public String displayName() {
        return displayName;
    }

    @Override
    public String toString() {
        return "\"" + displayName + "\"";
    }
}

