package ch.ferme.animal;

public class Volaille extends Animal implements IAnimal {

    public void seDeplacer() {
        System.out.println ("La volaille vole")
    }

    public Volaille() {
        super(2022, "poule pondeuse", "p002");
        System.out.println("Je suis dans Volaille");
    }

    private int nombreOeufs = 5;



    public int getnombreOeufs() {
        return nombreOeufs;

    }

public void setnombreOeuf(int newnombreOeufs) {
    nombreOeufs = newnombreOeufs;

}
}