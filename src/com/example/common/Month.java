package com.example.common;

public enum Month {

    JANUARY ("January"),
    FEBRAURT ("Febraury"),
    MARCH ("March"),
    APRIL ("April"),
    MAY ("May"),
    JUNE ("June"),
    JULY ("July"),
    AUGUST ("August"),
    SEPTEMBER ("September"),
    OCTOBER ("October"),
    NOVEMBER ("November"),
    DECEMBER ("December");

    public String englishName;

    Month(String englishName) {
        this.englishName = englishName;
    }
}
