package com.example.programacion3.model;

import com.example.programacion3.util.Persistencia;

import java.io.IOException;
import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

public class DatosPrueba implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    public DatosPrueba() throws IOException {

    }

    public static void main(String[] args) throws IOException {

        Cliente cliente = new Cliente();
        cliente.setTipoid(TipoID.CEDULA);
        cliente.setCedula("123");
        cliente.setApellido("vargas");
        cliente.setNombre("jacobo");
        cliente.setTelefono("123456789");
        cliente.setCodigo("01");


        Cliente cliente2 = new Cliente();
        cliente2.setTipoid(TipoID.CEDULA);
        cliente2.setCedula("1234");
        cliente2.setApellido("contreras");
        cliente2.setNombre("steven");
        cliente2.setTelefono("987654321");
        cliente2.setCodigo("02");

        Productos productos = new Productos();

        productos.setCodigo("001");
        productos.setNombre("Cama");
        productos.setPrecio(10000);

        Productos productos2 = new Productos();

        productos2.setCodigo("001");
        productos2.setNombre("Cama");
        productos2.setPrecio(10000);

        Pedidos pedidos = new Pedidos();
        pedidos.setCliente(cliente);
        pedidos.setFecha(String.valueOf(LocalDate.now()));
        pedidos.setProductos(productos);

        Pedidos pedidos2 = new Pedidos();
        pedidos2.setCliente(cliente2);
        pedidos2.setFecha(String.valueOf(LocalDate.now()));
        pedidos2.setProductos(productos2);


        Restaurante restaurante = new Restaurante();

        restaurante.getListaClientes().add(cliente);
        restaurante.getListaClientes().add(cliente2);

        restaurante.getListaProductos().add(productos);
        restaurante.getListaProductos().add(productos2);

        restaurante.getListaPedidos().add(pedidos);
        restaurante.getListaPedidos().add(pedidos2);

        Persistencia.guardarProductos(restaurante.getListaProductos());
        Persistencia.guardarCliente(restaurante.getListaClientes());

        Persistencia.guardarRecursoSubastaXML(restaurante);


    }
}
