package com.sherbrooke.paristennis.model;

public class Joueur {
    private String prenom;
    private String nom;
    private int age;
    private int rang;
    private String pays;

    public Joueur(String prenom, String nom, int age, int rang, String pays) {
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
        this.rang = rang;
        this.pays = pays;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRang() {
        return rang;
    }

    public void setRang(int rang) {
        this.rang = rang;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    @Override
    public String toString() {
        return "Joueur{" +
                "prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                ", age=" + age +
                ", rang=" + rang +
                ", pays='" + pays + '\'' +
                '}';
    }
}
