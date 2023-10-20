package com.example.hiloejerciciouno.join;

public class HiloUno extends Thread {

    int resultado;

    @Override
    public void run() {
        resultado = sumaRecursiva(10);
    }

    public int sumaRecursiva(int numero){
        if(numero == 0){
            return 0;
        }else{

            return numero + sumaRecursiva(numero -1);
        }
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
}
