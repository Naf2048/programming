import Classes.*;
import enums.*;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        HelicopterMan Karlson = new HelicopterMan("Карлсон", Geolocation.UNKNOWN);
        Child Malish = new Child("Малыш", Geolocation.UNKNOWN);

        int dayCount = (int) (Math.random()*11+5);

        SideObjects blanket = SideObjects.BLANKET;
        SideObjects window = SideObjects.WINDOW;
        SideObjects textbook = SideObjects.TEXTBOOK;

        System.out.println("Начало истории");

        for (int i=0;i<dayCount;i++){
            System.out.println("\n - День " + (i+1));

            if (i == 0){
                Malish.run(Geolocation.HOME_ROOM,window);
            }
            else {
                Malish.run(Geolocation.SCHOOL,textbook);
                if (i % ((int)Math.random()*4+3)== 0){
                    Malish.think(Karlson);
                }
                Malish.run(Geolocation.HOME_ROOM,null);
                if (i % ((int) Math.random()*1+2) == 0){
                    Malish.think(Karlson);
                }
            }
            Malish.cover(blanket);
            Malish.cry(i,Karlson.find());
            Malish.sleep();
        }
        System.out.println("\nКонец истории.");
    }

}