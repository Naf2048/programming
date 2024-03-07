package org.example.classes;


import org.example.enums.Geolocation;
import org.example.interfaces.Findable;

public class HelicopterMan extends Human implements Findable {
    public HelicopterMan(String name,Geolocation location) {
        super(name, location);
    }


    @Override
    public String find(){
        String condition;
        if(getLocation() != Geolocation.UNKNOWN){
            condition = this.getName() + " вернулся!";
        }
        else {
            condition = this.getName() + " еще не вернулся :(";
        }
        return condition;
    }

    public void checkLocation(){
        System.out.println(this.getName() + " сейчас находится в: " + this.getLocation().getLocationNow());
    }

}
