package com.example.joseph_bigdata;

public class Skateboard {

    private int id;
    private String nom;
    private String type;
    private String caracteristiques;

    public Skateboard(int id, String nom, String type, String caracteristiques) {
        this.id = id;
        this.nom = nom;
        this.type = type;
        this.caracteristiques = caracteristiques;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCaracteristiques() {
        return caracteristiques;
    }

    public void setCaracteristiques(String caracteristiques) {
        this.caracteristiques = caracteristiques;
    }
}
