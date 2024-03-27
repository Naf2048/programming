package org.example.enums;

public enum SideObjects {
    BLANKET("одеяло"),
    TEXTBOOK("учебник"),
    WINDOW("окно");



    private final String name;
    SideObjects(String rusName) { name = rusName;}
    public String getObjectRuName(){return name;}
}
