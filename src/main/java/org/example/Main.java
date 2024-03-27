package org.example;

import org.example.classes.*;
import org.example.enums.*;

public class Main {
    public static void main(String[] args) {
        HelicopterMan karlson = new HelicopterMan("Карлсон", Geolocation.UNKNOWN);
        Child malish = new Child("Малыш", Geolocation.HOME_ROOM, KnowlegeQuality.UNCONFIRMED, KnowlegeQuality.UNCONFIRMED, KnowlegeQuality.UNCONFIRMED, KnowlegeQuality.UNCONFIRMED ,KnowlegeQuality.UNCONFIRMED);
        HelicopterGrandma granny = new HelicopterGrandma( null, null);
        Friends Friends = new Friends( "друзья",Geolocation.DACHA);

        int dayNumber = (int) (Math.random() * 10  + 100);
        int weekendsDays = 86;// в угоду упрощения считаю дни на каникулах уже добавленными к счетчику дней
        Week todaysDay = Week.SATURDAY;
        boolean doggy = true;//статус собаки буквально значит у хозяина она или нет: true - рядом с ним, false - украли :(

        SideObjects blanket = SideObjects.BLANKET;
        SideObjects window = SideObjects.WINDOW;
        SideObjects textbook = SideObjects.TEXTBOOK;

        malish.setAllGradesSubject(KnowlegeQuality.AMAZING,KnowlegeQuality.GOOD,KnowlegeQuality.GOOD,KnowlegeQuality.FINE,KnowlegeQuality.AMAZING);
        System.out.println("Начало истории");
        malish.searchInformation(granny);
        todaysDay = malish.sleep(todaysDay);
        todaysDay = malish.travel(Geolocation.DACHA,doggy, weekendsDays, todaysDay);

        for (int i = 0;i<weekendsDays;i++){
            todaysDay = DaysAndDailyActivity.DailyActionOnLocation(malish.getLocation(),malish,todaysDay,Friends,karlson);
        }
        todaysDay = malish.travel(Geolocation.HOME_ROOM,doggy, 0, todaysDay);
        malish.setLocation(Geolocation.SCHOOL);//малыш готовиться ко школе
        for (int i = 0;i <dayNumber-weekendsDays;i++){
            todaysDay = DaysAndDailyActivity.DailyActionOnLocation(malish.getLocation(),malish,todaysDay,Friends,karlson);
            if (todaysDay==Week.FINALDAY){
                i = dayNumber-weekendsDays;
            }
        }

        karlson.checkLocation();
        System.out.println("\nКонец истории.");
    }
}