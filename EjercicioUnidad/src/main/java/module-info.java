module com.example.programacion {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.logging;


    opens com.example.programacion3 to javafx.fxml;
    exports com.example.programacion3;
    exports com.example.programacion3.util;
    opens com.example.programacion3.util to javafx.fxml;
    exports com.example.programacion3.model;
    opens com.example.programacion3.model to javafx.fxml;
}