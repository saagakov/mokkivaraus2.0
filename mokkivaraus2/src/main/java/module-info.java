module com.example.mokkivaraus2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mokkivaraus2 to javafx.fxml;
    exports com.example.mokkivaraus2;
}