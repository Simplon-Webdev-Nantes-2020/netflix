package co.simplon.polymorphisme;

public abstract class Animal {

    public void parler() {
        System.out.println("je suis un animal et je parle");
    }

    // public  void courir() {
    //     // methode a redefinir dans la classe enfant
    // }

    public abstract void courir();
}