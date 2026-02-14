package com.losto.controllers;

import com.losto.backend.entities.*;
import javafx.collections.*;
import javafx.collections.transformation.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.control.cell.*;
import javafx.scene.layout.*;

import java.net.*;
import java.util.*;

public class FournisseurController implements Initializable {
    @FXML
    private TableView tvF;
    private ObservableList<Fournisseur> data;
    @FXML
    private TableColumn<Fournisseur, String> tcCodeF;
    @FXML
    private TableColumn<Fournisseur, String> tcDesignationF;
    @FXML
    private TableColumn<Fournisseur, String> tcAdresseF;
    @FXML
    private TableColumn<Fournisseur, String> tcEmailF;
    @FXML
    private  Button btnAddF, btnUpdateF, btnDeleteF, btnClearF;
    @FXML
    Pane searchPaneF ;
    @FXML
    TextField txCodeF, txDesignationF, txAdresseF, txEmailF ;
    private int index = -1 ;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        SearchTextField searchTextField = new SearchTextField();
        searchTextField.getStyleClass().add("search-field");
        searchPaneF.getChildren().add(searchTextField);

        tcCodeF.setCellValueFactory(new PropertyValueFactory<>("Code"));
        tcDesignationF.setCellValueFactory(new PropertyValueFactory<>("Designation"));
        tcAdresseF.setCellValueFactory(new PropertyValueFactory<>("Adresse"));
        tcEmailF.setCellValueFactory(new PropertyValueFactory<>("Email"));
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

        tvF.setItems((SortedList) fournisseurSortedList);

        tvF.getSelectionModel()
                .selectedItemProperty()
                .addListener((obs, oldSelection, newSelection) -> {
                    if (newSelection != null) {
                         index = tvF.getSelectionModel().getSelectedIndex();
                        txCodeF.setText(data.get(index).getCode());
                        txDesignationF.setText(data.get(index).getDesignation());
                        txAdresseF.setText(data.get(index).getAdresse());
                        txEmailF.setText(data.get(index).getEmail());
                    }
                });

    }



    //Event Management
    @FXML
    public void handleButtonClick ( ActionEvent evt ){
        if (evt.getSource()==btnAddF) {
            data.add(new Fournisseur( txCodeF.getText().toString(), txDesignationF.getText().toString(), txAdresseF.getText().toString(), txEmailF.getText().toString()));
            fireSorting();
        }
        if (evt.getSource()==btnUpdateF) {
            if (index == -1) return;
            data.get(index).setCode(txCodeF.getText());
            data.get(index).setDesignation(txDesignationF.getText());
            data.get(index).setEmail(txEmailF.getText());
            data.get(index).setAdresse(txAdresseF.getText());
        }
        if (evt.getSource()==btnDeleteF) {
            data.remove(index); fireSorting();
        }
        if (evt.getSource()==btnClearF) {
           txCodeF.setText(""); txDesignationF.setText(""); txEmailF.setText(""); txAdresseF.setText("");

        }
    }

    private void fireSorting(){

        List<Fournisseur> fournisseurSortedList = new SortedList<>(data);
        ((SortedList) fournisseurSortedList).setComparator((m1, m2)->{
            return ((Fournisseur)m1).getDesignation().compareToIgnoreCase(((Fournisseur)m2).getDesignation());
        });
        tvF.setItems((SortedList) fournisseurSortedList);
    }

    /*public   void showAsDialog( String fxml ){
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

    }*/

    protected class SearchTextField extends HBox {

        private final TextField textField = new TextField();
        private final Label searchIcon = new Label("🔍");

        public SearchTextField() {
            searchIcon.setStyle("-fx-font-size: 14px; -fx-text-fill: #777;");
            this.getChildren().addAll(searchIcon, textField);
            this.setSpacing(6);
        }

        public String getText() {
            return textField.getText();
        }

        public TextField getTextField() {
            return textField;
        }
    }



}
