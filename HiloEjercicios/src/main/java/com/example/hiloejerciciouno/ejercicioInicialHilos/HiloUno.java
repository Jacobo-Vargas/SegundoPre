package com.example.hiloejerciciouno.ejercicioInicialHilos;

public class HiloUno extends Thread {

    /**
     * Hilo 1 que cree un arreglo e imprima sus valores.
     * Tiempo de espera en cada iteración : 1 segundo
     */

    @Override
    public void run() {

        try {
            int[] arreglo = new int[(int) ((Math.random()) * 10)];

            for (int i = 0; i < arreglo.length; i++) {
                arreglo[i] = (int) ((Math.random()) * 10);

                Thread.sleep(500);
                System.out.println(arreglo[i] + "------- Hilo 1 ");

            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
