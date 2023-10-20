package com.example.hiloejerciciouno.join;

public class Main extends Thread {
    /**
     * Construya 2 hilos (t1 y t2) que realicen las asignaciones de las instrucciones S2 y S3.
     * En el main() se debe lanzar a ejecución t1 y t2 una vez que terminen se realizan las
     * instrucciones S3 y S4.

     * El main() debe esperar a que terminen t1 y t2, utilizando la instrucción: join.

     * Instrucciones:

     * S1 = inicializar un N = 10  inicializar un String  palabra = “otorrinolaringologia”
     * S2 = sumaRecursiba(N)
     * S3 = contarVocales(palabra)
     * S4 = S2 * S3
     *          imprimir resultado
     */


    public static void main(String[] args) throws InterruptedException {

        HiloUno hiloUno = new HiloUno(); // declaro los clases a ejecutar con los hilos
        HiloDos hiloDos = new HiloDos();

        hiloUno.start();// inicializo los hilos
        hiloDos.start();


        hiloDos.join(); // espero a que ambos hilos se terminen antes de asignar los resultados
        hiloUno.join();

        int s2 = hiloUno.getResultado(); // una ves terminan asigno los resultados
        int s3 = hiloDos.getResultado();


        int s4 = s2 * s3; // opero el resultado obtenido
        System.out.println(s4);
    }


}
