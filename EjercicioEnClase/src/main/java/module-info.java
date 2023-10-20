module com.example.clasetres {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.clasetres to javafx.fxml;
    exports com.example.clasetres;
    exports com.example.clasetres.hilos_CreacionV1;
}