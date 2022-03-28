package ch.ferme.animal;

public class Animal {
    private int anneeNaissance;
    private String race;
    private String numero;
    private String sexe = "femelle";
    private String commentaire;

    public Animal(int anneNaissance, String race) {
        System.out.println("Je suis dans animal() avec 2 params");
        this.anneNaissance = anneeNaissance;
        this.race = race;
    }

    public Animal(int anneeNaissance, String race, String numero) {
        this(anneeNaissance, race);
        System.out.println("Je suis dans Animal() avec 3 params");
        this.numero = numero;
    }

    public Animal() {
        System.out.println("Je suis dans animal oue");

    }

    public int getAnneeNaissance() {
        return anneeNaissance;
    }

    public void setAnneeNaissance(int newAnneeNaissance) {
        anneeNaissance = newAnneeNaissance;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String newRace) {
        race = newRace;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String newNumero) {
        numero = newNumero;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String newSexe) {
        sexe = newSexe;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String newCommentaire) {
        commentaire = newCommentaire;
    }

}
