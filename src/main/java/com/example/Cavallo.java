package com.example;

public class Cavallo extends Thread {
    private int l;
    private String nome;

    public Cavallo(int lunghezza, String nome) {
        this.l = lunghezza;
        this.nome = nome;
    }

    public void run() {
        for (int i = 0; i < l; i++){
            if (Thread.currentThread().isAlive()) {
                Classifica.getArrivi().add(Thread.currentThread());
            }
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }

    public static void stampaArrayList () {
        for (int i = 0; i < Classifica.getArrivi().size(); i++) {
            System.out.println(Classifica.getArrivi().get(i));
        }
    }
}
