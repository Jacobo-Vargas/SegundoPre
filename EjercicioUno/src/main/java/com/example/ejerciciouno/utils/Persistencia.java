package com.example.ejerciciouno.utils;

import com.example.ejerciciouno.model.Estudiante;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Persistencia {

    private static final String RUTA_ARCHIVO_ESTUDIANTE = "src/main/resources/persistencia/archivo/estudiantes.txt";
    private static final String RUTA_ARCHIVO_LOG = "src/main/resources/persistencia/log/registroLog.txt";

    public static void guardarEstudiantes(Estudiante e) throws IOException {

        String contenido = "";

        contenido += e.getCodigo() +
                "@" + e.getNombre()  +
                "@" + e.getListaNotas() + "\n";


        ArchivoUtil.guardarArchivo(RUTA_ARCHIVO_ESTUDIANTE, contenido, true);
    }

    public static Estudiante cargarEstudiante(String codigo) throws FileNotFoundException, IOException {
        //ArrayList<Estudiante> estudiantes = new ArrayList<>();
        Estudiante encontrado = null;
        ArrayList<String> contenido = ArchivoUtil.leerArchivo(RUTA_ARCHIVO_ESTUDIANTE);

        String linea = "";

        for (String s : contenido) {
            linea = s;
            if ((linea.split("@")[0]).equals(codigo)) {
                encontrado = new Estudiante();
                encontrado.setCodigo(linea.split("@")[0]);
                encontrado.setNombre(linea.split("@")[1]);

                String e = (linea.split("@")[2].replace("[", "").replace("]", "").replaceAll("\\s+", ""));
                encontrado.getListaNotas().add(Float.valueOf(e.split(",")[0]));
                encontrado.getListaNotas().add(Float.valueOf(e.split(",")[1]));
                encontrado.getListaNotas().add(Float.valueOf(e.split(",")[2]));

            }
        }
        return encontrado;
    }


    public static void lanzarLog(String mensajeLog, int nivel, String accion) throws IOException {
        ArchivoUtil.guardarRegistroLog(mensajeLog, nivel, accion, RUTA_ARCHIVO_LOG);
    }

}
