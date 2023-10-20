package com.example.clasetres.model;

public class MainUno extends Thread{

    @Override
    public void run() {
        for (int i = 0; i <= 50; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
