package com.losto.controllers;

import com.losto.backend.entities.*;
import javafx.collections.*;
import javafx.fxml.*;
import javafx.scene.control.*;
import javafx.scene.control.cell.*;

import java.net.*;
import java.util.*;

public class HomeController implements Initializable {
    @FXML
    private Button btnExit ;
    @FXML
    private TableView tv;
    private  ObservableList<Member> data;

    @FXML
    private TableColumn<Member, String> tcName;
    @FXML
    private TableColumn<Member, String> tcEmail;
    @FXML
    private TableColumn<Member, String> tcMobile;
    @FXML
    private TableColumn<Member, String> tcAction;




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tcAction.setCellValueFactory(new PropertyValueFactory<>("Action"));
        tcEmail.setCellValueFactory(new PropertyValueFactory<>("Email"));
        tcMobile.setCellValueFactory(new PropertyValueFactory<>("Mobile"));
        tcName.setCellValueFactory(new PropertyValueFactory<>("Name"));
      data = FXCollections.observableArrayList(
              new Member("member 1", "09785634", "member1@gmail.com",  "Call"),
              new Member("member 2", "09785634","member2@gmail.com",  "Call"),
              new Member("member 3", "09785634","member3@gmail.com",  "Call"),
              new Member("member 1", "09785634", "member1@gmail.com",  "Call"),
              new Member("member 2", "09785634","member2@gmail.com",  "Call"),
              new Member("member 3", "09785634","member3@gmail.com",  "Call"),
              new Member("member 1", "09785634", "member1@gmail.com",  "Call"),
              new Member("member 2", "09785634","member2@gmail.com",  "Call"),
              new Member("member 3", "09785634","member3@gmail.com",  "Call"),
              new Member("member 1", "09785634", "member1@gmail.com",  "Call"),
              new Member("member 2", "09785634","member2@gmail.com",  "Call"),
              new Member("member 3", "09785634","member3@gmail.com",  "Call"),
              new Member("member 1", "09785634", "member1@gmail.com",  "Call"),
              new Member("member 2", "09785634","member2@gmail.com",  "Call"),
              new Member("member 3", "09785634","member3@gmail.com",  "Call"),
              new Member("member 1", "09785634", "member1@gmail.com",  "Call"),
              new Member("member 2", "09785634","member2@gmail.com",  "Call"),
              new Member("member 3", "09785634","member3@gmail.com",  "Call"),
              new Member("member 1", "09785634", "member1@gmail.com",  "Call"),
              new Member("member 2", "09785634","member2@gmail.com",  "Call"),
              new Member("member 3", "09785634","member3@gmail.com",  "Call"),
              new Member("member 1", "09785634", "member1@gmail.com",  "Call"),
              new Member("member 2", "09785634","member2@gmail.com",  "Call"),
              new Member("member 3", "09785634","member3@gmail.com",  "Call")
      );

      tv.setItems(data);

    }
}