module com.example.ejerciciodos {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    exports com.example.ejerciciodos.model;
    exports com.example.ejerciciodos.util;
    exports com.example.ejerciciodos;


    opens com.example.ejerciciodos to javafx.fxml;
    opens com.example.ejerciciodos.util to javafx.graphics;
    opens com.example.ejerciciodos.model to javafx.graphics;

}