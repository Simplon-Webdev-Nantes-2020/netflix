package co.simplon;

import java.util.ArrayList;
import java.util.Date;

public class Film {
    
    private String titre;
    private String resume;
    private Date dateSortie;
    private int duree;
    private Genre genre;
    private Type type;

    private  ArrayList<Acteur> acteurs;

    public Film(String titre, int duree) {
        this.titre = titre;
        this.duree = duree;
        this.acteurs = new ArrayList<Acteur>();
    }

    public void ajouterActeur(Acteur acteur) {
        this.acteurs.add(acteur);
        System.out.println("ajout de " + acteur + " dans " + this);
        acteur.ajouterFilm(this);
    }

    @Override
    public String toString() {
        return "Film [titre=" + titre + "]";
    }

    
}