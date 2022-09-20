package com.sherbrooke.paristennis.model;

import java.util.Arrays;

public class Pointage {

    private int[] manches;
    private int[] jeu;
    private int[] echanges;
    private boolean _final;

    public Pointage(int[] manches, int[] jeu, int[] echanges, boolean _final) {
        this.manches = manches;
        this.jeu = jeu;
        this.echanges = echanges;
        this._final = _final;
    }

    public int[] getManches() {
        return manches;
    }

    public void setManches(int[] manches) {
        this.manches = manches;
    }

    public int[] getJeu() {
        return jeu;
    }

    public void setJeu(int[] jeu) {
        this.jeu = jeu;
    }

    public int[] getEchanges() {
        return echanges;
    }

    public void setEchanges(int[] echanges) {
        this.echanges = echanges;
    }

    public boolean is_final() {
        return _final;
    }

    public void set_final(boolean _final) {
        this._final = _final;
    }

    @Override
    public String toString() {
        return "Pointage{" +
                "manches=" + Arrays.toString(manches) +
                ", jeu=" + Arrays.toString(jeu) +
                ", echanges=" + Arrays.toString(echanges) +
                ", _final=" + _final +
                '}';
    }
}
