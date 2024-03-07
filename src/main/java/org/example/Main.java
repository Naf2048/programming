package org.example;

import org.example.classes.*;
import org.example.enums.*;

public class Main {
    public static void main(String[] args) {
        HelicopterMan Karlson = new HelicopterMan("Карлсон", Geolocation.UNKNOWN);
        Child Malish = new Child("Малыш", Geolocation.UNKNOWN);

        int dayCount = (int) (Math.random() * 11 + 5);

        SideObjects blanket = SideObjects.BLANKET;
        SideObjects window = SideObjects.WINDOW;
        SideObjects textbook = SideObjects.TEXTBOOK;

        System.out.println("Начало истории");
        Karlson.checkLocation();

        for (int i = 0; i < dayCount; i++) {

            if (i == 0) {
                System.out.println("\n - День " + (i + 1));
                Malish.run(Geolocation.HOME_ROOM, window);
            } else {
                System.out.println(" - День " + (i + 1));
                Malish.run(Geolocation.SCHOOL, textbook);
                if ((i+1) % ((int) (Math.random() * 4 + 3)) == 0) {
                    Malish.think(Karlson);
                }
                Malish.run(Geolocation.HOME_ROOM, null);
                if ((i+1) % ((int) (Math.random() * 2 + 2)) == 0) {
                    Malish.think(Karlson);
                }
            }
            Malish.cover(blanket);
            Malish.cry(i, Karlson.find());
            Malish.sleep();
            System.out.println("\n");
        }
        Karlson.checkLocation();
        System.out.println("\nКонец истории.");
    }
}