package com.losto.controllers;

import com.losto.params.constants.*;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

import java.io.*;
import java.net.*;
import java.util.*;

public class ReferentielController implements Initializable {
    @FXML
    private AnchorPane containerFour, containerSeuil, containerCat,containerType, containerRayon, containerCond, containerForm;

    @FXML
    private TabPane mainTabPane;

    @FXML
    private Tab seuilTab, categorieTab, typeTab, rayonTab, conditionnementTab, fournisseurTab, formesTab ;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mainTabPane.

                getSelectionModel()
                .selectedItemProperty()
                .addListener((obs, oldTab, newTab) -> {
                    if (newTab !=null) {

                      if ( newTab.getText().equalsIgnoreCase("Fournisseur") && containerFour.getChildren().size()==0) {
                          loadView("referentiel/fourni.fxml", containerFour);
                          return ;
                      }
                        if ( newTab.getText().equalsIgnoreCase("Seuils") && containerSeuil.getChildren().size()==0) {
                            loadView("referentiel/fourni.fxml", containerSeuil);
                            return ;
                        }
                        if ( newTab.getText().equalsIgnoreCase("Catégories") && containerCat.getChildren().size()==0) {
                            loadView("referentiel/fourni.fxml", containerCat);
                            return ;
                        }
                        if ( newTab.getText().equalsIgnoreCase("Types") && containerType.getChildren().size()==0) {
                            loadView("referentiel/fourni.fxml", containerType);
                            return ;
                        }
                        if ( newTab.getText().equalsIgnoreCase("Rayon") && containerRayon.getChildren().size()==0) {
                            loadView("referentiel/fourni.fxml", containerRayon);
                            return ;
                        }

                        if ( newTab.getText().equalsIgnoreCase("Conditionnement") && containerCond.getChildren().size()==0) {
                            loadView("referentiel/fourni.fxml", containerCond);
                            return ;
                        }
                        if ( newTab.getText().equalsIgnoreCase("Formes") && containerForm.getChildren().size()==0) {
                            loadView("referentiel/fourni.fxml", containerForm);
                            return ;
                        }
                    }
                });


    }



    private void loadView(String fxml, AnchorPane container) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(Params.basePath + fxml));
            container.getChildren().setAll(root);
            AnchorPane.setTopAnchor(root, 0.0);
            AnchorPane.setBottomAnchor(root, 0.0);
            AnchorPane.setLeftAnchor(root, 0.0);
            AnchorPane.setRightAnchor(root, 0.0);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
