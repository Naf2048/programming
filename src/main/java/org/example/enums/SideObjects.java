package org.example.enums;

public enum SideObjects {
    BLANKET("одеяло"),
    TEXTBOOK("учебник"),
    WINDOW("окно");



    private final String name;
    SideObjects(String rus_name) { name = rus_name;}
    public String getObjectRuName(){return name;}
}
