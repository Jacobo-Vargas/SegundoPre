package com.example.programacion3.model;

import java.io.Serial;
import java.io.Serializable;

public class Pedidos implements Serializable {

    /**
     * fecha, total, cliente, los Productos.
     */

    @Serial
    private static final long serialVersionUID = 1L;

    private String fecha;
    private float total;

    private Cliente cliente;

    Productos productos;

    public Pedidos() {
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Productos getProductos() {
        return productos;
    }

    public void setProductos(Productos productos) {
        this.productos = productos;
    }
}
