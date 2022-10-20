module com.example.vemser {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.vemser to javafx.fxml;
    exports com.example.vemser;
}