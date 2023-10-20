package com.example.programacion3.model;

import java.io.Serial;
import java.io.Serializable;

public class Productos implements Serializable {

    /**
     * código,  nombre, precio.
     */

    private String codigo;
    private String nombre;

    private float precio;

    @Serial
    private static final long serialVersionUID = 1L;
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Productos{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
