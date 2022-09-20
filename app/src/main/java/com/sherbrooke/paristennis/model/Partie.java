package com.sherbrooke.paristennis.model;

public class Partie {

    private Joueur joueur1;
    private Joueur joueur2;
    private Match match;

    public Partie(Joueur joueur1, Joueur joueur2, Match match) {
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
        this.match = match;
    }

    public Joueur getJoueur1() {
        return joueur1;
    }

    public void setJoueur1(Joueur joueur1) {
        this.joueur1 = joueur1;
    }

    public Joueur getJoueur2() {
        return joueur2;
    }

    public void setJoueur2(Joueur joueur2) {
        this.joueur2 = joueur2;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    @Override
    public String toString() {
        return "Partie{" +
                "joueur1=" + joueur1 +
                ", joueur2=" + joueur2 +
                ", match=" + match +
                '}';
    }
}
