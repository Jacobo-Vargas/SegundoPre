package com.example.hiloejerciciouno.ejercicioInicialHilos;

public class Main {

    public static void main(String[] args) {
//       hilo1();
//       hilo2();
       hilo3();
    }

    public static void hilo1(){
        HiloUno h1 = new HiloUno();
        h1.start();
    }

    public static void hilo2(){
        HiloDos h2 = new HiloDos();
        h2.start();
    }

    public static void hilo3(){
        HiloTres h3 = new HiloTres();
        h3.start();
    }


}
