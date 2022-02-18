package org.launchcode.enumerableplanets.models;

public enum Planets {
    MERCURY("Mercury", 88),
    VENUS("Venus", 225),
    EARTH("Earth", 365),
    MARS("Mars", 687),
    JUPITER("Jupiter", 4333),
    SATURN("Saturn", 10759),
    URANUS("Uranus", 30687),
    NEPTUNE("Neptune", 60200);

    private final String name;
    private final int yearLength;

    Planets(String name, int yearLength) {
        this.yearLength = yearLength;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getYearLength() {
        return yearLength;
    }
}
