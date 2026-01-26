package com.losto.backend.entities;

import javafx.beans.property.*;

public class Member {
    private SimpleStringProperty name;
    private SimpleStringProperty Email;
    private SimpleStringProperty mobile;
    private SimpleStringProperty action ;

    public Member(String  name, String mobile, String email, String action) {
        this.name =  new SimpleStringProperty(name);
        this.Email = new SimpleStringProperty(email);
        this.mobile = new SimpleStringProperty(mobile);
        this.action = new SimpleStringProperty(action);
    }

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getEmail() {
        return Email.get();
    }



    public void setEmail(String email) {
        this.Email.set(email);
    }

    public String getMobile() {
        return mobile.get();
    }



    public void setMobile(String phone) {
        this.mobile.set(phone);
    }

    public String getAction() {
        return action.get();
    }



    public void setAction(String action) {
        this.action.set(action);
    }
}
