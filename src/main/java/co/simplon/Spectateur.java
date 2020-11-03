package co.simplon;

import java.util.ArrayList;

public class Spectateur {

    private String nom;
    private int age;

    private ArrayList<Film> filmsVisionnes;

    public Spectateur(String nom, int age) {
        this.nom = nom;
        this.age = age;
        this.filmsVisionnes = new ArrayList<Film>();
    }

    public ArrayList<Film> getFilmsVisionnes() {
        return filmsVisionnes;
    }
  
}