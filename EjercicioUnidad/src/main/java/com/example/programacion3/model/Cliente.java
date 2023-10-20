package com.example.programacion3.model;

import java.io.Serial;
import java.io.Serializable;

public class Cliente implements Serializable {

    /**
     * código,  cédula, tipo de identificación, nombre, apellidos y teléfono.
     */


    @Serial
    private static final long serialVersionUID = 1L;
    private String nombre;
    private String apellido;
    private String codigo;
    private TipoID tipoid;
    private String cedula;
    private String telefono;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public TipoID getTipoid() {
        return tipoid;
    }

    public void setTipoid(TipoID tipoid) {
        this.tipoid = tipoid;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Clientes{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", codigo='" + codigo + '\'' +
                ", tipoid=" + tipoid +
                ", cedula='" + cedula + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }


}
