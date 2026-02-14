package com.losto.backend.entities;
import javafx.beans.property.*;

public class Fournisseur {
    private SimpleStringProperty code;
    private SimpleStringProperty designation;
    private SimpleStringProperty adresse;
    private SimpleStringProperty email ;

    public Fournisseur(String  code, String designation, String adresse, String email) {
        this.code =  new SimpleStringProperty(code);
        this.designation = new SimpleStringProperty(designation);
        this.adresse = new SimpleStringProperty(adresse);
        this.email = new SimpleStringProperty(email);
    }

    public String getCode() {
        return code.get();
    }

    public SimpleStringProperty codeProperty() {
        return code;
    }

    public void setCode(String code) {
        this.code.set(code);
    }

    public String getDesignation() {
        return designation.get();
    }

    public SimpleStringProperty designationProperty() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation.set(designation);
    }

    public String getAdresse() {
        return adresse.get();
    }

    public SimpleStringProperty adresseProperty() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse.set(adresse);
    }

    public String getEmail() {
        return email.get();
    }

    public SimpleStringProperty emailProperty() {
        return email;
    }

    public void setEmail(String email) {
        this.email.set(email);
    }
}
