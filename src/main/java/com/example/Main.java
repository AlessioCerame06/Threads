package com.example;

public class Main {
    public static void main(String[] args) {
        int l = 100;
        Cavallo t1 = new Cavallo(l, "Cavallo1");
        t1.start();
        Cavallo t2 = new Cavallo(l, "Cavallo2");
        t2.start();
        Cavallo t3 = new Cavallo(l, "Cavallo3");
        t3.start();
        Cavallo t4 = new Cavallo(l, "Cavallo4");
        t4.start();
        Cavallo t5 = new Cavallo(l, "Cavallo5");
        t5.start();
        Cavallo t6 = new Cavallo(l, "Cavallo6");
        t6.start();
        Cavallo t7 = new Cavallo(l, "Cavallo7");
        t7.start();
        Cavallo t8 = new Cavallo(l, "Cavallo8");
        t8.start();
        Cavallo t9 = new Cavallo(l, "Cavallo9");
        t9.start();
        Cavallo t10 = new Cavallo(l, "Cavallo10");
        t10.start();
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
            t6.join();
            t7.join();
            t8.join();
            t9.join();
            t10.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Numero cavalli: " + Classifica.getArrivi().size());
    }
}