package org.example.classes;

import org.example.enums.Geolocation;
import org.example.interfaces.PlayableSolo;
import org.example.interfaces.PlayableTogether;

public class Friends extends Human implements PlayableSolo, PlayableTogether {

    public Friends(String name, Geolocation location_now) {
        super(name, location_now);
    }
    final static String MalyshFriendName = "Ка...Кэ...Ой, да не помним мы!";

    @Override
    public void playingTogether(Friends friendo, HelicopterMan Karlson) {
        if (Karlson.getName() == MalyshFriendName) {
            System.out.println("откуда они его знают?");
        } else {
            System.out.println(this.getName() + " сейчас играют");
        }
    }

    @Override
    public void playingWithMalysh(Child friendo) {
        if (friendo.getLocation() == Geolocation.DACHA){
            System.out.println(this.getName() + " сейчас играют с " + friendo.getName());
        }
        else{
            System.out.println(this.getName() + " сейчас играют без " + friendo.getName() + "a");
        }
    }

}
