package com.formation.sprformation;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Contact {
    @Id
    private String email;
    private String text;

    public Contact() {
    }

    public Contact(String email, String text) {
        this.email = email;
        this.text = text;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
