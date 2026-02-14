package com.losto;

import com.losto.params.constants.*;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.stage.*;

import java.io.*;
import java.util.*;

public class Bootstrap extends javafx.application.Application {


    private double xOffset = 0;
    private double yOffset = 0;
    private void enableWindowDrag(Node node, Stage stage) {

        node.setOnMousePressed(event -> {
            if (event.isPrimaryButtonDown()) {
                xOffset = event.getSceneX();
                yOffset = event.getSceneY();
            }
        });

        node.setOnMouseDragged(event -> {
            if (event.isPrimaryButtonDown()) {
                stage.setX(event.getScreenX() - xOffset);
                stage.setY(event.getScreenY() - yOffset);
            }
        });
    }
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader root = new FXMLLoader(Bootstrap.class.getResource (Params.basePath+ "home.fxml"));
        Parent root = FXMLLoader.load(Objects.requireNonNull(Bootstrap.class.getResource(Params.basePath + "home.fxml")));
        Scene scene = new Scene(root);
        stage.initStyle(StageStyle.UNDECORATED);
        enableWindowDrag(root, stage);
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}