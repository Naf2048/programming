package org.example.classes;

import org.example.enums.Geolocation;
import org.example.enums.Marks;
import org.example.enums.Week;

import static org.example.enums.Week.MONDAY;
import static org.example.enums.Week.TUESDAY;

public class DaysAndDailyActivity {
    //смена дня
    public static Week newDay(Week day){
        switch (day) {
            case MONDAY:
                day = Week.TUESDAY;
                break;
            case TUESDAY:
                day = Week.WEDNESDAY;
                break;
            case WEDNESDAY:
                day = Week.THURSDAY;
                break;
            case THURSDAY:
                day = Week.FRIDAY;
                break;
            case FRIDAY:
                day = Week.SATURDAY;
                break;
            case SATURDAY:
                day = Week.SUNDAY;
                break;
            case SUNDAY:
                day = Week.MONDAY;
                break;

        }

        return day;
    }
    //дневные занятия
    public static Week DailyActionOnLocation(Geolocation location,Child person,Week day, Friends friends, HelicopterMan Karlson){
        if (day == Week.FINALDAY){
            return day;
        }
        if (location == Geolocation.DACHA){
            System.out.println(person.getName() + " проснулся рано утром и пошел гулять");
            if (day == MONDAY || day == Week.THURSDAY || day == Week.SATURDAY){
                person.playingTogether(friends,Karlson);
                HolidaysActivity.HideAndSeek(person);
                day = person.sleep(day);
            } else if (day == Week.TUESDAY || day == Week.SUNDAY) {
                person.playingTogether(friends,Karlson);
                HolidaysActivity.CatchMe(person);
                day = person.sleep(day);
            } else {
                person.playingTogether(friends,Karlson);
                HolidaysActivity.BlindCat(person);
                day = person.sleep(day);
            }

        } else if (location == Geolocation.SCHOOL) {
            if (day == MONDAY ){
                schoolDays.getGradeMath(person);
                person.think(Karlson);
                day = person.sleep(day);
            } else if (day == Week.TUESDAY ) {
                schoolDays.getGradeArt(person);
                day = person.sleep(day);
            } else if (day == Week.WEDNESDAY ) {
                schoolDays.getGradeEng(person);
                person.cry(Karlson.find());
                day = person.sleep(day);
            } else if (day == Week.THURSDAY ) {
                schoolDays.getGradeRus(person);
                person.think(Karlson);
                day = person.sleep(day);
            } else if (day == Week.FRIDAY){
                schoolDays.getGradeComp(person);
                person.setLocation(Geolocation.HOME_ROOM);
                day = person.sleep(day);
            } else {
                schoolDays.getGood(person);
                if (day== Week.SUNDAY){person.setLocation(Geolocation.SCHOOL);
                    day = person.sleep(day);}
            }
        } else if (location == Geolocation.HOME_ROOM ) {
            System.out.println( person.getName() + " находясь у себя дома решил заняться своей коллекцией марок.");
            System.out.println(person.getName() + " был очень сосредоточен и незамечая произносил вслух цвета марок: ");
            if (person.getName()=="Малыш"){
                Album memoryLoss = new Album(){
                    @Override
                    public void applyMark(int i){
                            for (i = 0; i< album.length; i++){
                                int num = (int)(Math.random()*2+1);
                                if (num == 1) {
                                    album[i] = Marks.BLUE;
                                } else if (num == 2) {
                                    album[i] = Marks.RED;
                                } else if (num == 3) {
                                    album[i] = Marks.GREEN;
                                }
                        }
                        for (Marks markColorInAlbum : album){
                            System.out.println(markColorInAlbum.getObjectRuName()+"~~");
                        }
                    }
                };
                memoryLoss.applyMark(0);
            }
            day = Week.FINALDAY;
        }

        return day;
    }

    // группа школьных активностей
    public static class schoolDays {
        public static void getGradeMath(Child student){
            System.out.println("Оценка за период обучения " + student.getName() + ": " + student.mathGrade.getGrade() );
        }
        public static void getGradeArt(Child student){
            System.out.println("Оценка за период обучения " + student.getName() + ": " + student.artGrade.getGrade() );
        }
        public static void getGradeEng(Child student){
            System.out.println("Оценка за период обучения " + student.getName() + ": " + student.engGrade.getGrade() );
        }
        public static void getGradeRus(Child student){
            System.out.println("Оценка за период обучения " + student.getName() + ": " + student.rusGrade.getGrade() );
        }
        public static void getGradeComp(Child student){
            System.out.println("Оценка за период обучения " + student.getName() + ": " + student.compGrade.getGrade() );
        }
        public static void getGood(Child student){
            System.out.println("С самого утра до ночи как прилежный ученик " + student.getName() + " делал дз по матанализу и линалу и заполнял тетрадь по кику.");
        }
    }
    // группа активностей на каникулах
    public static class HolidaysActivity{
        public static void HideAndSeek(Child player){
            System.out.println("Сегодня " + player.getName() + " играл в прятки.");
        }
        public static void BlindCat(Child player){
            System.out.println("Сегодня " + player.getName() + " играл в слепого кота.");
        }
        public static void CatchMe(Child player) {
            System.out.println("Сегодня " + player.getName() + " играл в пятнашки.");
        }
    }


}
