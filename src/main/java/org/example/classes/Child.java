package org.example.classes;

import org.example.Exceptions.ForgottenFriendException;
import org.example.Exceptions.SchrodingerDogException;
import org.example.enums.*;

import org.example.interfaces.*;

public class Child extends Human implements Cryable, Runable, Sleepable, Openable, Coverable, Travelable, PlayableSolo, PlayableTogether {
    public Child(String name, Geolocation location, KnowlegeQuality mathGrade, KnowlegeQuality unconfirmed, KnowlegeQuality knowlegeQuality, KnowlegeQuality quality, KnowlegeQuality unconfirmed1) {
        super(name, location);
        this.mathGrade = mathGrade;
        this.artGrade = artGrade;
        this.engGrade = engGrade;
        this.rusGrade = rusGrade;
        this.compGrade = compGrade;
    }
    protected String dogName = "Бимбо";
    protected KnowlegeQuality mathGrade;
    protected KnowlegeQuality artGrade;
    protected KnowlegeQuality engGrade;
    protected KnowlegeQuality rusGrade;
    protected KnowlegeQuality compGrade;




    public void checkDog(boolean status) throws SchrodingerDogException {
        if (!status) {
            throw new SchrodingerDogException(dogName + " не обнаружена , поездка невозможна");
        }
    }

    public void tryToRemember(String Karlason) throws ForgottenFriendException {
        if (this.getLocation() != Geolocation.DACHA && Karlason != "Карлсон") {
            throw new ForgottenFriendException("Ну и кто после такого другом может себя звать?");
        }
    }
    public void setAllGradesSubject(KnowlegeQuality math, KnowlegeQuality art, KnowlegeQuality engLanguage, KnowlegeQuality rusLanguage, KnowlegeQuality compScience){
        mathGrade = math;
        artGrade = art;
        engGrade = engLanguage;
        rusGrade = rusLanguage;
        compGrade = compScience;
    }

    public void setMathGrade(KnowlegeQuality grade){
        mathGrade = grade;
    }
    public void setArtGrade(KnowlegeQuality grade){
        artGrade = grade;
    }
    public void setEngGrade(KnowlegeQuality grade){
        engGrade = grade;
    }
    public void setRusGrade(KnowlegeQuality grade){
        rusGrade = grade;
    }
    public void setCompGrade(KnowlegeQuality grade){
        compGrade = grade;
    }

    @Override
    public void cry(String reason) {

        System.out.println(this.getName() + " плачет потому-что " + reason);

    }

    @Override
    public void open(String obj) {
        System.out.println(getName() + " открыл " + obj);
    }


    @Override
    public void run(Geolocation place, SideObjects object) {
        setLocation(place);
        System.out.println(this.getName() + " примчался в: " + place.getLocationNow());
        if (place == Geolocation.SCHOOL) {

        }


        if (object != null) {
            open(object.getObjectRuName());
        }
    }

    @Override
    public void cover(SideObjects obj) {
        System.out.println(this.getName() + " укрылся используя: " + obj.getObjectRuName());
    }

    @Override
    public Week sleep(Week day) {
        System.out.println(this.getName() + " уснул");
        day = DaysAndDailyActivity.newDay(day);
        System.out.println("На следующий день: \n");
        return day;
    }

    @Override
    public Week travel(Geolocation place, Boolean DogStatus, int weekends_days, Week dayOfWeek) {
        class HappyJourney {
            public void tryStartMoving() {
                try {
                    checkDog(DogStatus);
                } catch (SchrodingerDogException sde) {
                    System.out.println(sde.getMessage());
                }
            }
        }
        setLocation(place);
        if (weekends_days != 0) {
            System.out.println(this.getName() + " приехал в " + place.getLocationNow() + " и проведет здесь " + weekends_days + " дней своих каникул!");
        } else {
            System.out.println(this.getName() + " приехал в " + place.getLocationNow());
        }
        System.out.println("Сегодня " + this.getName() + " устал с дороги и сразу лег спать");
        sleep(dayOfWeek);
        return dayOfWeek;
    }

    public void think(HelicopterMan friend) {
        System.out.println(this.getName() + " думает о " + friend.getName());
    }

    @Override
    public void playingTogether(Friends friend, HelicopterMan Karlson) {
        try {
            tryToRemember(Karlson.getName());
            System.out.println(this.getName() + " играет с " + friend.getName() + " на " + this.getLocation().getLocationNow());

        } catch (ForgottenFriendException ffe) {
            System.out.println(ffe.getMessage());
        }

    }


    @Override
    public void playingWithMalysh(Child friendo) {
        System.out.println(this.getName() + " играет сам с собой :(");
    }

    public void searchInformation(HelicopterGrandma grandma) {
        System.out.println(this.getName() + " выяснил что " + grandma.find());
    }

}
