package org.example.enums;

public enum Week {
    MONDAY("понедельник"),
    TUESDAY("вторник"),
    WEDNESDAY("среда"),
    THURSDAY("четверг"),
    FRIDAY("пятница"),
    SATURDAY("суббота"),
    SUNDAY("воскресенье"),
    FINALDAY("последний день");


    private final String dayOfWeek;
    Week(String rusName) { dayOfWeek = rusName;}

    public String getDayOfWeek(){return dayOfWeek;}
}
