package com.losto;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.*;

import java.io.IOException;

public class Bootstrap extends javafx.application.Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader root = new FXMLLoader(Bootstrap.class.getResource("views/home.fxml"));
        Scene scene = new Scene(root.load());
        stage.initStyle(StageStyle.UNDECORATED);

        /*move around implementation*/

        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}