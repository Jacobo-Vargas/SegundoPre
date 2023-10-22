package com.example.clasetres;


import com.example.clasetres.hilos_CreacionV1.Main;
import com.example.clasetres.hilos_CreacionV1.ManejadorHilo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import com.example.clasetres.model.*;

public class HelloController {

    public static ManejadorHilo principal = new ManejadorHilo();

    @FXML
    void mainDos(ActionEvent event) throws InterruptedException {
        System.out.println("Hola");

    }

    @FXML
    void mainUno(ActionEvent event) throws InterruptedException {
        for (int i = 0; i <= 50; i++) {
            System.out.println(i);
            Thread.sleep(500);
        }

    }


    @FXML
    void detenerServicioDos(ActionEvent event) {
        principal.detenerHiloServicio2();
    }

    @FXML
    void detenerServicioTres(ActionEvent event) {
        principal.detenerHiloServicio3();
    }

    @FXML
    void detenerServicioUno(ActionEvent event) {
        principal.detenerHiloServicio1();
    }
    @FXML
    void detenerServicioCinco(ActionEvent event) {
        principal.detenerHiloServicio5();
    }

    @FXML
    void detenerServicioCuatro(ActionEvent event) {
        principal.detenerHiloServicio4();
    }


    @FXML
    void startServicioDos(ActionEvent event) {
        principal.starHiloServicio2();
    }

    @FXML
    void startServicioTres(ActionEvent event) {
        principal.starHiloServicio3();
    }

    @FXML
    void startServicioUno(ActionEvent event) {
        principal.starHiloServicio1();
    }
    @FXML
    void startServicioCinco(ActionEvent event) {
        principal.startHiloServicio5();
    }

    @FXML
    void startServicioCuatro(ActionEvent event) {
        principal.startHiloServicio4();
    }

    public void nada(){

    }
}