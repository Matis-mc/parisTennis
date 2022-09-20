package com.sherbrooke.paristennis.model;

import java.util.Arrays;

public class Match {

    private String terrain;
    private String tournoi;
    private String heureDebut;
    private int tempsPartie;
    private int serveur;
    private int vitesseDernierService;
    private int nombreCoupEchange;
    private int[] contestation;
    private Pointage pointage;

    public Match(String terrain, String tournoi, String heureDebut, int tempsPartie, int serveur, int vitesseDernierService, int nombreCoupEchange, int[] contestation, Pointage pointage) {
        this.terrain = terrain;
        this.tournoi = tournoi;
        this.heureDebut = heureDebut;
        this.tempsPartie = tempsPartie;
        this.serveur = serveur;
        this.vitesseDernierService = vitesseDernierService;
        this.nombreCoupEchange = nombreCoupEchange;
        this.contestation = contestation;
        this.pointage = pointage;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public String getTournoi() {
        return tournoi;
    }

    public void setTournoi(String tournoi) {
        this.tournoi = tournoi;
    }

    public String getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(String heureDebut) {
        this.heureDebut = heureDebut;
    }

    public int getTempsPartie() {
        return tempsPartie;
    }

    public void setTempsPartie(int tempsPartie) {
        this.tempsPartie = tempsPartie;
    }

    public int getServeur() {
        return serveur;
    }

    public void setServeur(int serveur) {
        this.serveur = serveur;
    }

    public int getVitesseDernierService() {
        return vitesseDernierService;
    }

    public void setVitesseDernierService(int vitesseDernierService) {
        this.vitesseDernierService = vitesseDernierService;
    }

    public int getNombreCoupEchange() {
        return nombreCoupEchange;
    }

    public void setNombreCoupEchange(int nombreCoupEchange) {
        this.nombreCoupEchange = nombreCoupEchange;
    }

    public int[] getContestation() {
        return contestation;
    }

    public void setContestation(int[] contestation) {
        this.contestation = contestation;
    }

    public Pointage getPointage() {
        return pointage;
    }

    public void setPointage(Pointage pointage) {
        this.pointage = pointage;
    }

    @Override
    public String toString() {
        return "Match{" +
                "terrain='" + terrain + '\'' +
                ", tournoi='" + tournoi + '\'' +
                ", heureDebut='" + heureDebut + '\'' +
                ", tempsPartie=" + tempsPartie +
                ", serveur=" + serveur +
                ", vitesseDernierService=" + vitesseDernierService +
                ", nombreCoupEchange=" + nombreCoupEchange +
                ", contestation=" + Arrays.toString(contestation) +
                ", pointage=" + pointage.toString() +
                '}';
    }
}
