package com.example.ejerciciodos.util;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ArchivoUtil {

    public static void guardarXml(String ruta, Object objeto) throws FileNotFoundException {
        XMLEncoder encoder;

        encoder = new XMLEncoder(new FileOutputStream(ruta));
        encoder.writeObject(objeto);
        encoder.close();
    }

    public static Object cargarXml(String ruta) throws FileNotFoundException {

        XMLDecoder decoder;
        Object object;

        decoder = new XMLDecoder(new FileInputStream(ruta));

        object = decoder.readObject();
        decoder.close();

        return object;

    }

}
