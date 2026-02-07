package com.losto;

import com.losto.params.constants.*;
import javafx.fxml.*;
import javafx.scene.Scene;
import javafx.stage.*;



import java.io.IOException;

public class Bootstrap extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader root = new FXMLLoader(Bootstrap.class.getResource (Params.basePath+ "home.fxml"));
        Scene scene = new Scene(root.load());
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}