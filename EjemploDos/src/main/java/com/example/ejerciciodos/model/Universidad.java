package com.example.ejerciciodos.model;

import java.util.ArrayList;

public class Universidad {

    ArrayList<Programa> listaProgramas = new ArrayList<>();

    public Universidad() {
    }

    public ArrayList<Programa> getListaProgramas() {
        return listaProgramas;
    }

    public void setListaProgramas(ArrayList<Programa> listaProgramas) {
        this.listaProgramas = listaProgramas;
    }
}
