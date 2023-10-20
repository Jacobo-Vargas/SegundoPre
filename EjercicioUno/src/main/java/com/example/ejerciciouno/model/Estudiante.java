package com.example.ejerciciouno.model;

import java.util.ArrayList;

public class Estudiante {

    private String nombre;
    private String codigo;
    private ArrayList<Float> listaNotas = new ArrayList<>();

    public Estudiante() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Float> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(ArrayList<Float> listaNotas) {
        this.listaNotas = listaNotas;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                ", listaNotas=" + listaNotas +
                '}';
    }
}
