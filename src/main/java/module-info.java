module com.example.members {

    requires javafx.controls;
    requires javafx.fxml;
    requires com.dlsc.formsfx;

    opens com.losto to javafx.fxml;
    opens  com.losto.forms to javafx.fxml;
    opens com.losto.controllers to javafx.fxml;
    opens com.losto.backend.entities to javafx.base;

    // FXML controllers
    //opens com.example.members to javafx.fxml;

    //ENTITÉS / MODELS (obligatoire pour bindings)
    //opens com.losto.backend.entities to javafx.base;

    exports com.losto;
    //exports com.losto.controllers;
    //exports com.losto.backend.entities;

}