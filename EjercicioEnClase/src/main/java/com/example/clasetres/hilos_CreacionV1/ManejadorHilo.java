package com.example.clasetres.hilos_CreacionV1;

public class ManejadorHilo implements Runnable {


    static int numero = 2;

    HiloServicio1 hiloServicio1;
    HiloServicio2 hiloServicio2;
    HiloServicio3 hiloServicio3;
    Thread hiloServicio4 = new Thread(this); // this es para que corra en este mismo run(contexto)
    Thread hiloServicio5 = new Thread(this);

    boolean runHilo4 = true;
    boolean runHilo5 = true;


    public ManejadorHilo() {

    }

    public void starHiloServicio1() {
        hiloServicio1 = new HiloServicio1();
    }

    public void detenerHiloServicio1() {

        if (hiloServicio1 != null)
            hiloServicio1.detener();
    }

    public void starHiloServicio2() {
        hiloServicio2 = new HiloServicio2();
    }

    public void detenerHiloServicio2() {

        if (hiloServicio2 != null)
            hiloServicio2.detener();
    }

    public void starHiloServicio3() {
        hiloServicio3 = new HiloServicio3();
    }

    public void detenerHiloServicio3() {
        if (hiloServicio3 != null)
            hiloServicio3.detener();
    }

    public void detenerHiloServicio4() {
        runHilo4 = false;
    }

    public void detenerHiloServicio5() {
        runHilo5 = false;
    }


    @Override
    public void run() {
        if (Thread.currentThread() == hiloServicio4) {
            try {
                int i = 0;
                while (runHilo4) {
                    System.out.println(numero + " * " + i + " = " + numero * i);
                    i++;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        if (Thread.currentThread() == hiloServicio5) {
            try {
                while (runHilo5) {
                    numero = numero + numero;
                    System.out.println("numero ahora es:" + numero);
                    Thread.sleep(3000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public void startHiloServicio4() {
        hiloServicio4.start();
    }

    public void startHiloServicio5() {
        hiloServicio5.start();
    }


}
