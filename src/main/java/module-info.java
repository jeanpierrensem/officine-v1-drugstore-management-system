module com.example.members {
    requires javafx.controls;
    requires javafx.fxml;
    opens com.losto to javafx.fxml;
    exports com.losto;
    exports com.losto.controllers;
    opens com.losto.controllers to javafx.fxml;
    exports com.losto.backend.entities;
    opens com.losto.backend.entities to javafx.fxml;
}