package org.example.classes;

import org.example.enums.Geolocation;

import java.util.Objects;

public abstract class Human{
    private final String name;
    private Geolocation geolocation;
    public Human(String name, Geolocation location_now) {
        this.name = name;
        this.geolocation = location_now;
    }

    public String getName() {
        return name;
    }
    public Geolocation getLocation(){return geolocation;}
    public void setLocation(Geolocation location){this.geolocation = location;}
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                '}';
    }
}
