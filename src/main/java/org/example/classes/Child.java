package org.example.classes;

import org.example.enums.Geolocation;
import org.example.enums.SideObjects;
import org.example.interfaces.*;

public class Child extends Human implements Cryable, Runable, Sleepable, Thinkable, Openable ,Coverable{
    public Child(String name, Geolocation location) {
        super(name, location);
    }

    @Override
    public void cry(int num,String reason) {
        if (num==1 || num%((int) (Math.random()*2+2)) == 0){
            System.out.println(this.getName() + " плачет потому-что " + reason );
        }
    }

    @Override
    public void open(String obj) {
        System.out.println(getName() + " открыл " + obj);
    }



    @Override
    public void run(Geolocation place, SideObjects object ) {
        setLocation(place);
        System.out.println(this.getName() + " примчался в: " + place.getLocationNow());
        if (object != null) {
            open(object.getObjectRuName());
        }
    }

    @Override
    public void cover(SideObjects obj){
        System.out.println(this.getName() + " укрылся используя: " + obj.getObjectRuName());
    }

    @Override
    public void sleep() {
        System.out.println(this.getName() + " уснул");
    }


    @Override
    public void think(HelicopterMan friend) {
        System.out.println(this.getName() + " думает о " + friend.getName());
    }

}
