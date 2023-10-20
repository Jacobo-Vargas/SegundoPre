package com.example.programacion3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.util.Locale;
import java.util.ResourceBundle;

public class HelloController {

    @FXML
    private TextField txtContrasenia;

    @FXML
    private TextField txtUsuario;

    @FXML
    void ingresarSistema(ActionEvent event) {
        verificarCredenciales();
        System.out.println("ga");
    }

    public void initialize() {
       // verificarCredenciales();

    }

    public void verificarCredenciales() {
        String usuario = obtenerUsuario();
        String contra = obtenerContrasenia();

        if (txtContrasenia.getText().equals(contra) && txtUsuario.getText().equals(usuario)) {

            System.out.println("verdadero");
            JOptionPane.showMessageDialog(null, "Acceso Exitoso");
        }else{
            JOptionPane.showMessageDialog(null, "paila");
        }
    }

    public String obtenerUsuario() {
        ResourceBundle resourceBundle;
        resourceBundle = ResourceBundle.getBundle("login");

        return resourceBundle.getString("usuario");
    }

    public String obtenerContrasenia() {
        ResourceBundle resourceBundle;
        resourceBundle = ResourceBundle.getBundle("login");

        return resourceBundle.getString("contrasenia");
    }
}
