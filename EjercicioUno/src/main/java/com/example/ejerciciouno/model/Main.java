package com.example.ejerciciouno.model;

import java.util.ArrayList;

public class Main {

    private ArrayList<Estudiante> listaEstudiantes  = new ArrayList<>();

    public Main() {
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }
}
