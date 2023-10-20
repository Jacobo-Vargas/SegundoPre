package com.example.programacion3.model;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;

public class Restaurante implements Serializable {

    private ArrayList<Cliente> listaClientes = new ArrayList<>();
    private ArrayList<Productos> listaProductos = new ArrayList<>();

    private ArrayList<Pedidos> listaPedidos = new ArrayList<>();

    @Serial
    private static final long serialVersionUID = 1L;

    public Restaurante() {

    }

    public static void main(String[] args) {
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public ArrayList<Productos> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Productos> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public ArrayList<Pedidos> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(ArrayList<Pedidos> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }
}
