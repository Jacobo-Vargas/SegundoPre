module com.example.ejerciciodos {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.ejerciciodos to javafx.fxml;
    exports com.example.ejerciciodos;
    exports com.example.ejerciciodos.model;
    opens com.example.ejerciciodos.model to javafx.fxml;
}