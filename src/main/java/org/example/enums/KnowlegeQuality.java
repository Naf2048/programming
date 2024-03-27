package org.example.enums;

public enum KnowlegeQuality {
    UNCONFIRMED(0),
    FINE(3),
    GOOD(4),
    AMAZING(5);




    private final int grade;
    KnowlegeQuality(int genericGrade) { grade = genericGrade;}

    public int getGrade(){return grade;}
}
