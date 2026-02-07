package com.losto.controllers;

import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class UserController {
    @FXML
    AnchorPane idadduser ;

    @FXML
    Button btnReturn, btnAdd;
    @FXML
    public void handleOnClick(ActionEvent evt){
        if (evt.getSource()==btnAdd) {
            System.out.println("Ajouter un user");
            return ;
        }

        //case return
        Stage stage = (Stage) ((Node) evt.getSource())
                    .getScene()
                    .getWindow();
            stage.close();

    }



}
