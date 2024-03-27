package org.example.classes;

import org.example.Exceptions.TheGrandmaMysteryExeption;
import org.example.enums.Geolocation;
import org.example.interfaces.Findable;


public class HelicopterGrandma extends Human implements Findable {
    public HelicopterGrandma(String name, Geolocation location) {
        super(name, location);
    }
    private void showUp() {
        if (getLocation() != null && getName() != null){
            throw new TheGrandmaMysteryExeption("сокровища людей пропеллеров существуют!");
        }
    }
    @Override
    public String find(){
        String condition = "";
        try {
            showUp();
            condition = "о Бабушке Карлсона нет информации";
        } catch (TheGrandmaMysteryExeption e) {
            System.out.println(e.getMessage());
        }
        return condition;
    }
}
