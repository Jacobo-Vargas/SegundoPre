package com.example.hiloejerciciouno.join;

public class HiloDos extends Thread{

    int resultado;

    @Override
    public void run() {
        resultado = contarVocales("otorrinolaringologia");
    }

    public int contarVocales(String palabra){
        if(palabra.isEmpty()){
            return 0;
        }else{
            if(esVocal(palabra.charAt(0))){
                return 1 + contarVocales(palabra.substring(1));
            }else{
                return contarVocales(palabra.substring(1));
            }
        }
    }

    public boolean esVocal(Character caracter){
        return caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u';
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
}
