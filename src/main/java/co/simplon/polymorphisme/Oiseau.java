package co.simplon.polymorphisme;

public class Oiseau extends Animal {

    static String text = "je suis un oiseau et je vole";

    public void voler() {
        this.voler(0);
    }

    public void voler(int nbCompagnon) {
        System.out.println(text + " avec " + nbCompagnon + " compagnons");
    }

    public void voler(String vitesse) {
        System.out.println(text + vitesse);
    }

    @Override
    public void parler() {
        System.out.println("cui cui");
    }

    public void courir() {

    }
}