package com.losto.controllers;


import com.losto.params.constants.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

import java.io.*;


public class HomeController  {
    @FXML
    BorderPane rootPane ;

    @FXML
    Button btnSec, btnRef, btnApp, btnStock, btnStat, btnIaAna, btnExit, btnConnecter;

    @FXML
    public void handleOnClick ( ActionEvent evt ){
        System.out.println("Dans securité");
        if (evt.getSource()==btnSec) {
            loadView("securite.fxml");
            return;
        }
        if (evt.getSource()==btnRef) {
            loadView("referentiel.fxml");
            return;
        }

        if (evt.getSource()==btnApp) {
            loadView("appro.fxml");
            return;
        }

        if (evt.getSource()==btnStock) {
            loadView("stock.fxml");
            return;
        }

        if (evt.getSource()==btnStat) {
            loadView("stat.fxml");
            return;
        }

        if (evt.getSource()==btnIaAna) {
            loadView("iaana.fxml");
            return;
        }
        if (evt.getSource()==btnExit) {
            javafx.application.Platform.exit();

        }
        if (evt.getSource()==btnConnecter) {
            rootPane.setCenter(null);
        }
    }
    private void loadView(String fxml) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource( Params.basePath +  fxml));
            Node view = loader.load();
            rootPane.setCenter(view);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}