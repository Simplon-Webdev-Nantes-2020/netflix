package co.simplon;

import java.util.ArrayList;

public class Acteur {

    private String nom;
    private String prenom;

    private ArrayList<Film> films;

    public Acteur(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.films = new ArrayList<Film>();
    }

    public void ajouterFilm(Film film) {
        this.films.add(film);
        System.out.println("ajout de " + film + " dans " + this);
    }

    @Override
    public String toString() {
        return "Acteur [nom=" + nom + ", prenom=" + prenom + "]";
    }
    
    
}