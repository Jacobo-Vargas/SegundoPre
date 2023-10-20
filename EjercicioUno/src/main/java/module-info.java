module com.example.ejerciciouno {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;


    opens com.example.ejerciciouno to javafx.fxml;
    exports com.example.ejerciciouno;
    exports com.example.ejerciciouno.model;

}