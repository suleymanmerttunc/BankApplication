module com.example.tuncbank {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.sql;


    opens com.example.tuncbank to javafx.fxml;
    exports com.example.tuncbank;
    exports com.example.tuncbank.forLoginScreenComplements;
    opens com.example.tuncbank.forLoginScreenComplements to javafx.fxml;
}