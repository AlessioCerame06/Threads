package com.example;

import java.util.ArrayList;

public class Classifica {
    private static ArrayList <Thread> arrivi = new ArrayList<>();

    public static ArrayList<Thread> getArrivi() {
        return arrivi;
    }

    public static void setArrivi(ArrayList<Thread> arrivi) {
        Classifica.arrivi = arrivi;
    }
}
