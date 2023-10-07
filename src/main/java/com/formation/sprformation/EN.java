package com.formation.sprformation;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EN {

    @Id
    private String champ1;

    public EN(){}
    public EN(String champ1){
        this.champ1 = champ1;
    }
    public String getChamp1() {
        return champ1;
    }
    public void setChamp1(String champ1) {
        this.champ1 = champ1;
    }
}
