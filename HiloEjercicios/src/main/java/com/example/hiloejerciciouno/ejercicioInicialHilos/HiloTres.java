package com.example.hiloejerciciouno.ejercicioInicialHilos;

public class HiloTres extends Thread {
    /**
     * Hilo 3 que imprima el nombre del mismo hilo 15 veces.
     * Tiempo de espera en cada iteración : 500 ms
     */
    @Override
    public void run() {
        try{
            imprimirNombre(15);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String imprimirNombre(int veces) throws InterruptedException {
        if(veces == 0){
            return "";
        }else{
            System.out.println(this.getName() + " ------------ Hilo 3");
            Thread.sleep(500);
           return  imprimirNombre(veces-1);
        }
    }
}
