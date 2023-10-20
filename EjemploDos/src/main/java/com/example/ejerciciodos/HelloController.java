package com.example.ejerciciodos;

import com.example.ejerciciodos.model.Programa;
import com.example.ejerciciodos.model.Universidad;
import com.example.ejerciciodos.util.Persistencia;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class HelloController {

    private final Universidad universidad = new Universidad();

    @FXML
    private ComboBox<String> cBoxModalidad;

    @FXML
    private TableView<Programa> tvPrograma;

    @FXML
    private TableColumn<Programa, String> tcCodigo;

    @FXML
    private TableColumn<Programa, String> tcModalidad;

    @FXML
    private TableColumn<Programa, String> tcNombre;


    @FXML
    private TextField txtCodigoPrograma;

    @FXML
    private TextField txtCodigobuscarPrograma;

    @FXML
    private TextField txtNombrePrograma;


    public void initialize() {
        cargarComboBox();
    }

    @FXML
    void agregarPrograma(ActionEvent event) {

        Programa programa = crearPrograma(txtCodigoPrograma.getText(), txtNombrePrograma.getText(), String.valueOf(cBoxModalidad.getValue()));
        universidad.getListaProgramas().add(programa);
        Persistencia.guardarXml(universidad);
    }

    @FXML
    void buscarPrograma(ActionEvent event) throws FileNotFoundException {

        Universidad universidad1 = (Universidad) Persistencia.cargarXml();

        for (Programa p : universidad1.getListaProgramas()) {
            if (p.getCodigo().equals(txtCodigobuscarPrograma.getText())) {
                cargarResultado(p.getCodigo(), p.getNombre(), p.getModalidad());

                ArrayList<Programa> lista = new ArrayList<>();
                lista.add(p);

                tvPrograma.setItems(FXCollections.observableArrayList(lista));

            }

        }
    }


    public Programa crearPrograma(String codigo, String nombre, String modalidad) {

        Programa programa = new Programa();
        programa.setCodigo(codigo);
        programa.setModalidad(modalidad);
        programa.setNombre(nombre);

        return programa;
    }

    public void cargarComboBox() {

        ObservableList<String> opciones = FXCollections.observableArrayList(Persistencia.cargarPropiedades());
        cBoxModalidad.setItems(opciones);
    }

    public void cargarResultado(String codigo, String nombre, String modalidad) {

        tcCodigo.setCellValueFactory(cellData -> new SimpleStringProperty(codigo));
        tcNombre.setCellValueFactory(cellData -> new SimpleStringProperty(nombre));
        tcModalidad.setCellValueFactory(cellData -> new SimpleStringProperty(modalidad));
    }

}