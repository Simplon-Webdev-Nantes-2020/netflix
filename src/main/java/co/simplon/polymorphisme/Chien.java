package co.simplon.polymorphisme;

public class Chien extends Animal {
    
    private String nom; 
    private String race;

    

    @Override
    public void parler() {
        System.out.println("ouaf ouaf");
    }

    public void courir() {
        System.out.println("je cours");
    }


    @Override
    public String toString() {
        return "Chien [nom=" + nom + ", race=" + race + "]";
    }

    public Chien(String nom) {
        this.nom = nom;
    }


}