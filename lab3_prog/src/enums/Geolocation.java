package enums;

import java.util.Arrays;

public enum Geolocation {
    HOME_ROOM("дом - комната малыша"),
    SCHOOL("школа"),
    UNKNOWN("(неизвестно)");


    protected final String location;
    String[] contains;
    Geolocation(String location_now){location = location_now;}

    public String getLocationNow() {
        return location;
    }

    public void setContains(String[] contains) {
        this.contains = contains;
    }

    public String[] getContains() {
        return contains;
    }

    @Override
    public String toString() {
        return "location{" +
                "name='" + location + '\'' +
                ", contains=" + Arrays.toString(contains) +
                '}';
    }
}
