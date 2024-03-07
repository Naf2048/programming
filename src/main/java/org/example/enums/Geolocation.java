package org.example.enums;

import java.util.Arrays;

public enum Geolocation {
    HOME_ROOM("дом - комната малыша"),
    SCHOOL("школа"),
    UNKNOWN("(неизвестно)");


    private final String location;
    String[] contains;
    Geolocation(String location_now){location = location_now;}

    public String getLocationNow() {
        return location;
    }


    @Override
    public String toString() {
        return "location{" +
                "name='" + location + '\'' +
                ", contains=" + Arrays.toString(contains) +
                '}';
    }
}
