package com.example.ejerciciouno;

import com.example.ejerciciouno.model.Estudiante;
import com.example.ejerciciouno.utils.Persistencia;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;
import java.util.ArrayList;

public class EstudianteController {
    private ArrayList<Estudiante> listaEstudiantes = new ArrayList();

    @FXML
    public TextField txtBuscarCodigo;
    @FXML
    public TableView<Estudiante> tvMostarEstudiante;
    @FXML
    private TableColumn<Estudiante, String> tcCodigo;

    @FXML
    private TableColumn<Estudiante, String> tcNombre;

    @FXML
    private TableColumn<Estudiante, String> tcNotaDos;

    @FXML
    private TableColumn<Estudiante, String> tcNotaTres;

    @FXML
    private TableColumn<Estudiante, String> tcNotaUno;


    @FXML
    private TextField txtCodigo;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtNotaDos;

    @FXML
    private TextField txtNotaTres;

    @FXML
    private TextField txtNotaUno;

    @FXML
    void aceptarRegistro(ActionEvent event) throws IOException {


        Estudiante estudiante = new Estudiante();

        estudiante.setNombre(txtNombre.getText());
        estudiante.setCodigo(txtCodigo.getText());
        estudiante.getListaNotas().add(Float.valueOf(txtNotaUno.getText()));
        estudiante.getListaNotas().add(Float.valueOf(txtNotaDos.getText()));
        estudiante.getListaNotas().add(Float.valueOf(txtNotaTres.getText()));

        listaEstudiantes.add(estudiante);
        alerta("Se agrego con exito.");
        Persistencia.guardarEstudiantes(estudiante);
        Persistencia.lanzarLog("Registro estudiante", 1, "REGISTRO");


    }

    public void initialize() {
    }

    public void buscarEstudiante(ActionEvent actionEvent) throws IOException {

        Estudiante e = Persistencia.cargarEstudiante(txtBuscarCodigo.getText());

        if (e == null){
            alerta("No se econtraron coincidencias.");
        }
        if (e != null){

            tcCodigo.setCellValueFactory(cellData -> new SimpleStringProperty(e.getCodigo()));
            tcNombre.setCellValueFactory(cellData -> new SimpleStringProperty(e.getNombre()));
            tcNotaUno.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(e.getListaNotas().get(0))));
            tcNotaDos.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(e.getListaNotas().get(1))));
            tcNotaTres.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(e.getListaNotas().get(2))));

            // Crear una lista con el estudiante y establecerla en el TableView
            ArrayList<Estudiante> estudiantes = new ArrayList<>();
            estudiantes.add(e);
            tvMostarEstudiante.setItems(FXCollections.observableList(estudiantes));

            // Refrescar el TableView
            tvMostarEstudiante.refresh();

            Persistencia.lanzarLog("Busqueda",1,"Buscar estudiante");
        }
    }

    public void alerta(String mensaje){
        Alert alert = new Alert(Alert.AlertType.WARNING,mensaje,ButtonType.OK);
        alert.show();
    }
}
