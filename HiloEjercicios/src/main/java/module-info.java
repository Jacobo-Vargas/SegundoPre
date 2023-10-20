module com.example.hiloejerciciouno {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hiloejerciciouno to javafx.fxml;
    exports com.example.hiloejerciciouno;
}