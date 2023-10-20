package com.example.hiloejerciciouno.ejercicioInicialHilos;

public class HiloDos extends Thread {
    /**
     * Hilo 2 que cree un entero y lo multiplique por el mismo 10 veces.
     * Tiempo de espera en cada iteración : 1.5 segundo
     */

    @Override
    public void run() {
        try {
            int numero = crearEntero();
            multiplicarEntero(numero,10);

        } catch (InterruptedException e) {
            throw new RuntimeException("Error." + e);
        }
    }

    public int crearEntero() {
        return (int) (Math.random() * 100);
    }

    public long multiplicarEntero(int numero, int veces) throws InterruptedException {

        if (veces == 0) {
            return 1;
        } else {
            long acumulado = (long) numero * multiplicarEntero(numero, veces - 1);
            System.out.println(acumulado+ "-------------- Hilo 2");
            Thread.sleep(500);
            return acumulado;
        }
    }
}