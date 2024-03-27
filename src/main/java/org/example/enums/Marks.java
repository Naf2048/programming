package org.example.enums;

public enum Marks {
    RED("красная марка"),
    BLUE("зеленая марка"),
    GREEN("синяя марка");



    private final String markName;
    Marks(String rusName) { markName = rusName;}

    public String getObjectRuName(){return markName;}

}
