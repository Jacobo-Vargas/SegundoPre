package com.example.programacion3.util;

import com.example.programacion3.model.Cliente;
import com.example.programacion3.model.Pedidos;
import com.example.programacion3.model.Productos;
import com.example.programacion3.model.Restaurante;

import java.io.IOException;
import java.util.ArrayList;


public class Persistencia {

    public static final String RUTA_ARCHIVO_CLIENTE = "src/main/resources/persistencia/archivos/clientes.txt";
    public static final String RUTA_ARCHIVO_PRODUCTOS = "src/main/resources/persistencia/archivos/productos.txt";
    public static final String RUTA_ARCHIVO_MODELO_SUBASTA_XML = "src/main/resources/persistencia/restaurante.xml";

    public static void guardarProductos(ArrayList<Productos> listaProductos) throws IOException {

        String contenido = "";

        for (Productos p : listaProductos) {
            contenido += p.getCodigo() +
                    "@" + p.getNombre() +
                    "@" + p.getPrecio() + "\n";
        }
        ArchivoUtil.guardarArchivo(RUTA_ARCHIVO_PRODUCTOS, contenido, false);
    }


    public static void guardarCliente(ArrayList<Cliente> listaClientes) throws IOException {

        String contenido = "";

        for (Cliente p : listaClientes) {
            contenido += p.getCodigo() +
                    "@" + p.getNombre() +
                    "@" + p.getApellido() +
                    "@" + p.getCedula() +
                    "@" + p.getCodigo() +
                    "@" + p.getTelefono() +
                    "@" + p.getTipoid() + "\n";
        }

        ArchivoUtil.guardarArchivo(RUTA_ARCHIVO_CLIENTE, contenido, false);

    }

    public static void guardarObjetos(ArrayList<Pedidos> listaPedidos, String ruta) throws IOException {
        String contenido = "";

        for (Pedidos pedidos : listaPedidos) {
            contenido += pedidos.getFecha() +
                    "@" + pedidos.getCliente() +
                    "@" + pedidos.getProductos() +
                    "@" + pedidos.getTotal() + "\n";
        }
        ArchivoUtil.guardarArchivo(ruta, contenido, true);
    }

    public static void guardarRecursoSubastaXML(Restaurante restaurante) {

        try {
            ArchivoUtil.salvarRecursoSerializadoXML(RUTA_ARCHIVO_MODELO_SUBASTA_XML, restaurante);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


}
