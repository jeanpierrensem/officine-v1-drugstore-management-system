package com.losto.controllers;
import com.losto.backend.entities.*;
import com.losto.params.constants.*;
import javafx.collections.*;
import javafx.collections.transformation.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.control.cell.*;
import javafx.stage.*;
import java.io.*;
import java.net.*;
import java.util.*;

public class ProfilesController implements Initializable {
    @FXML
    private TableView tv;
    private ObservableList<Fournisseur> data;

    @FXML
    private TableColumn<Fournisseur, String> tcName;
    @FXML
    private TableColumn<Fournisseur, String> tcEmail;
    @FXML
    private TableColumn<Fournisseur, String> tcMobile;
    @FXML
    private TableColumn<Fournisseur, String> tcAction;

    @FXML
    private  Button btnAdd, btnExport, btnImport, btnProfile;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tcAction.setCellValueFactory(new PropertyValueFactory<>("Action"));
        tcEmail.setCellValueFactory(new PropertyValueFactory<>("Email"));
        tcMobile.setCellValueFactory(new PropertyValueFactory<>("Mobile"));
        tcName.setCellValueFactory(new PropertyValueFactory<>("Name"));
        data = FXCollections.observableArrayList(
                new Fournisseur("member 1", "09785634", "member1@gmail.com",  "Call"),
                new Fournisseur("member 2", "09785634","member2@gmail.com",  "Call"),
                new Fournisseur("member 3", "09785634","member3@gmail.com",  "Call"),
                new Fournisseur("member 1", "09785634", "member1@gmail.com",  "Call"),
                new Fournisseur("member 2", "09785634","member2@gmail.com",  "Call"),
                new Fournisseur("member 3", "09785634","member3@gmail.com",  "Call"),
                new Fournisseur("member 1", "09785634", "member1@gmail.com",  "Call"),
                new Fournisseur("member 1", "09785634", "member1@gmail.com",  "Call"),
                new Fournisseur("member 2", "09785634","member2@gmail.com",  "Call"),
                new Fournisseur("member 3", "09785634","member3@gmail.com",  "Call"),
                new Fournisseur("member 1", "09785634", "member1@gmail.com",  "Call"),
                new Fournisseur("member 2", "09785634","member2@gmail.com",  "Call"),
                new Fournisseur("member 3", "09785634","member3@gmail.com",  "Call"),
                new Fournisseur("member 1", "09785634", "member1@gmail.com",  "Call"),
                new Fournisseur("member 1", "09785634", "member1@gmail.com",  "Call")

        );
        List<Fournisseur> fournisseurSortedList = new SortedList<>(data);
        ((SortedList) fournisseurSortedList).setComparator((m1, m2)->{
            return ((Fournisseur)m1).getDesignation().compareToIgnoreCase(((Fournisseur)m2).getDesignation());
        });

        tv.setItems((SortedList) fournisseurSortedList);

    }

    //Event Management
    @FXML
    public void handleButtonClick ( ActionEvent evt ){
        if (evt.getSource()==btnAdd) {
            System.out.println("In addnew case");
            showAsDialog("addNew");

        }
        if (evt.getSource()==btnImport) {
            System.out.println("In import case");
            showAsDialog("import");
        }
        if (evt.getSource()==btnExport) {
            System.out.println("In export case");
            showAsDialog("export");
        }
    }

    public   void showAsDialog( String fxml ){
        try {
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource( Params.basePath + fxml + ".fxml")
            );

            Stage stage = new Stage();
            Scene scene = new Scene(loader.load());
            stage.setScene(scene);
            //stage.setAlwaysOnTop(true);
            stage.setResizable(false);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.showAndWait();

        } catch(IOException e){
            System.out.println(e.getMessage());
        }

    }



}
