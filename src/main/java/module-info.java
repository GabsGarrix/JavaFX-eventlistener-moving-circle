module com.example.mexer {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.mexer to javafx.fxml;
    exports com.example.mexer;
}