package org.example.interfaces;

import org.example.enums.Geolocation;
import org.example.enums.Week;

public interface Travelable {
    Week travel(Geolocation geolocation, Boolean DogStatus, int days, Week day);
}
