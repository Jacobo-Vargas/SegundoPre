package com.example.ejerciciouno.utils;

import java.io.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class ArchivoUtil {

    public static void guardarArchivo(String ruta, String contenido, boolean borrarExistente) throws IOException {
        FileWriter fileWriter = new FileWriter(ruta, borrarExistente);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(contenido);
        bufferedWriter.close();
        fileWriter.close();
    }

    public static ArrayList<String> leerArchivo(String ruta) throws IOException {

        ArrayList<String> contenido = new ArrayList<>();

        FileReader fileReader = new FileReader(ruta);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String linea = "";

        while((linea = bufferedReader.readLine())!= null){

            contenido.add(linea);
        }
        bufferedReader.close();
        fileReader.close();
        return contenido;

    }

    public static void guardarRegistroLog(String mensajeLog, int nivel, String accion, String rutaArchivoLog) throws IOException {

        String log = "";
        Logger LOGGER = Logger.getLogger(accion);
        FileHandler fileHandler = null;

        String fecha = String.valueOf(LocalDate.now());

        try {

            fileHandler = new FileHandler(rutaArchivoLog, true);
            fileHandler.setFormatter(new SimpleFormatter());
            LOGGER.addHandler(fileHandler);

            switch (nivel) {
                case 1:
                    LOGGER.log(Level.INFO, accion + "," + mensajeLog + " --> " + fecha);
                    break;

                case 2:
                    LOGGER.log(Level.WARNING, accion + "," + mensajeLog + " --> " + fecha);
                    break;

                case 3:

                    LOGGER.log(Level.SEVERE, accion + "," + mensajeLog + " --> " + fecha);
                    break;
                default:
                    break;
            }
        } catch (SecurityException | IOException e) {

            LOGGER.log(Level.SEVERE, e.getMessage());
            e.printStackTrace();

        } finally {
            fileHandler.close();
        }
    }
}
