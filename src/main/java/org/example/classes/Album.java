package org.example.classes;

import org.example.enums.Marks;

public class Album {
    private static String owner = "Малыш";
    public Marks[] album = new Marks[10];
    public void applyMark(int num){
        System.out.println("на альбом наклеели марку! Радость то какая!!!");
    }
}
