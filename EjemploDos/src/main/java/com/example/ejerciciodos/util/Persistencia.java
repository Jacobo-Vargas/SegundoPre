package com.example.ejerciciodos.util;

import com.example.ejerciciodos.model.Programa;
import com.example.ejerciciodos.model.Universidad;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Persistencia {

    private static final String RUTA_XML = "src/main/resources/persistencia/registros.xml";

    public static ArrayList<String> cargarPropiedades(){

        ArrayList<String> propiedades = new ArrayList<>();

        ResourceBundle resourceBundle;
        resourceBundle = ResourceBundle.getBundle("modalidad");
        
        propiedades.add(resourceBundle.getString("modalidad1"));
        propiedades.add(resourceBundle.getString("modalidad2"));
        propiedades.add(resourceBundle.getString("modalidad3"));
        
        return propiedades;
    }

    public static void guardarXml(Universidad universidad){
        try{
            ArchivoUtil.guardarXml(RUTA_XML,universidad);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static Object cargarXml() throws FileNotFoundException {
       return ArchivoUtil.cargarXml(RUTA_XML);
    }
}
