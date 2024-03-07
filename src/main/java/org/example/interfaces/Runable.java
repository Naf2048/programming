package org.example.interfaces;

import org.example.enums.Geolocation;
import org.example.enums.SideObjects;

public interface Runable {
    void run(Geolocation place, SideObjects obj);
}
