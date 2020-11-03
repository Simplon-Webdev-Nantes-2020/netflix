package co.simplon;

import java.util.Date;

import co.simplon.polymorphisme.Animal;
import co.simplon.polymorphisme.Chien;
import co.simplon.polymorphisme.Moineau;
import co.simplon.polymorphisme.Oiseau;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }


    static private void faireParler(Animal animal) {
        animal.parler();
        animal.courir();
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        Acteur michel = new Acteur("Sardou","michel");
        Acteur angela = new Acteur("Sardou","Angela");

        Film film = new Film("Bienvenue chez les bretons", 180);

        film.ajouterActeur(michel);
        film.ajouterActeur(angela);

    }
}
